package com.wellsfargo.batch5.pms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;
import com.wellsfargo.batch5.pms.service.BackOfficeUserService;
import com.wellsfargo.batch5.pms.service.UserDetailsService;


@Controller
public class BackOfficeUserController {
	
	@Autowired
	private  BackOfficeUserService backOfficeUserService;
	

	@GetMapping("/registerBackOfficeUser")
	public ModelAndView registerAction() {

		ModelAndView mv = new ModelAndView("admin/backOfficeUserForm","user",new UserDetailsDto());
		return mv;
	}
	
	@PostMapping("/addBackOfficeUser")
	public ModelAndView addUserAction(@ModelAttribute("user") @Valid UserDetailsDto user,BindingResult result) throws PMSException {
		  ModelAndView mv=null;
		  backOfficeUserService.add(user);
		  mv = new ModelAndView("redirect:/Home");
		  return mv;
	}
	
	
	
	
}