package com.wellsfargo.batch5.pms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch5.pms.dto.CommoditiesDto;
import com.wellsfargo.batch5.pms.dto.CompanyDetailsDto;
import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;
import com.wellsfargo.batch5.pms.service.CommoditiesService;
import com.wellsfargo.batch5.pms.service.CompanyDetailsService;
import com.wellsfargo.batch5.pms.service.UserDetailsService;


@Controller

public class CommoditiesController {
	
	@Autowired
	private CommoditiesService commoditiesService;

	
	
	@GetMapping("/registerNewCommodity")
	public ModelAndView registerAction() {

		ModelAndView mv = new ModelAndView("backOfficeUser/commodityForm","commodity",new CommoditiesDto());
		return mv;
	}
	
	@PostMapping("/addCommodityDetails")
	public ModelAndView addCommodityAction(@ModelAttribute("commodity") @Valid CommoditiesDto commodity,BindingResult result) throws PMSException {
		  ModelAndView mv=null;
		  commoditiesService.add(commodity);
		  mv = new ModelAndView("commoditySuccess");
		  return mv;
	}
	
	
	/*@GetMapping("/getall")
	public ModelAndView booksAction() throws PMSException {
		return new ModelAndView("admin/userList","users",userDetailsService.getAll());
	}*/
	
	
}