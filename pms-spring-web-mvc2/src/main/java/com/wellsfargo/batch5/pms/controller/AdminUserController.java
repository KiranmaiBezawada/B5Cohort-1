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

import com.wellsfargo.batch5.pms.dto.UserDetailsDto;
import com.wellsfargo.batch5.pms.exception.PMSException;
import com.wellsfargo.batch5.pms.service.BackOfficeUserService;
import com.wellsfargo.batch5.pms.service.UserDetailsService;


@Controller

public class AdminUserController {

	

	@GetMapping("/adminHomePage")
	public String navigateHomePageAction() {

		return "admin/adminFunctionality";
	}
	
	
	@GetMapping("/adminLogin")
	public String adminLogin() {
		String view="login-form";
		return view;
	}
		
	
}