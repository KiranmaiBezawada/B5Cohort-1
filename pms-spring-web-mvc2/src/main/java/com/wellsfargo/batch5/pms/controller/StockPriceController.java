package com.wellsfargo.batch5.pms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch5.pms.dto.StockPriceDto;
import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;
import com.wellsfargo.batch5.pms.service.StockPriceService;
import com.wellsfargo.batch5.pms.service.UserDetailsService;


@Controller
public class StockPriceController {
	
	@Autowired
	private StockPriceService stockPriceService;
	

	@GetMapping("/registerNewStock")
	public ModelAndView registerAction() {

		ModelAndView mv = new ModelAndView("backOfficeUser/stockForm","stock",new StockPriceDto());
		return mv;
	}
	
	@PostMapping("/addStockDetails")
	public ModelAndView addStockAction(@ModelAttribute("stock") @Valid StockPriceDto stock,BindingResult result) throws PMSException {
		  ModelAndView mv=null;
		  stockPriceService.add(stock);
		  mv = new ModelAndView("redirect:/Home");
		  return mv;
	}
	
	
		
	
}