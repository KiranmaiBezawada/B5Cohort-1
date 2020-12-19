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

import com.wellsfargo.batch5.pms.dto.CompanyDetailsDto;
import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;
import com.wellsfargo.batch5.pms.service.CompanyDetailsService;
import com.wellsfargo.batch5.pms.service.UserDetailsService;


@Controller

public class CompanyDetailsController {
	
	@Autowired
	private CompanyDetailsService companyDetailsService;
	
	@GetMapping("/registerNewCompany")
	public ModelAndView registerAction() {

		ModelAndView mv = new ModelAndView("backOfficeUser/companyForm","company",new CompanyDetailsDto());
		return mv;
	}
	
	@PostMapping("/addCompanyDetails")
	public ModelAndView addCompanyAction(@ModelAttribute("company") @Valid CompanyDetailsDto company,BindingResult result) throws PMSException {
		  ModelAndView mv=null;
		  companyDetailsService.add(company);
		  mv = new ModelAndView("companySuccess");
		  return mv;
	}
	
	
	@GetMapping("/showCompanySearchPage")
	public ModelAndView showSerachCompanyCodeAction() {
    	ModelAndView mv = new ModelAndView("backOfficeUser/searchByCompany","company",new CompanyDetailsDto());
		return mv;
	}
	
	
	@PostMapping("/getCompanyDetails")
	public ModelAndView getCompanyDetail(String companyCode) throws PMSException {
		return new ModelAndView("backOfficeUser/companyList2","company",companyDetailsService.getById(Long.parseLong(companyCode)));		
	}
	
	
	@GetMapping("/getallCompanyDetails")
	public ModelAndView getAllCompanyDetails() throws PMSException {
		return new ModelAndView("backOfficeUser/companyList","company",companyDetailsService.getAll());
	}
	
}
	
	
