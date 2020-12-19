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
import com.wellsfargo.batch5.pms.service.UserDetailsService;


@Controller
public class UserController {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@GetMapping("/login-form")
	public String loginForm() {
		return "login-form";
	}

	@GetMapping("/register")
	public ModelAndView registerAction() {

		ModelAndView mv = new ModelAndView("/register_form","user",new UserDetailsDto());
		return mv;
	}
	
	@PostMapping("/add")
	public ModelAndView addUserAction(@Valid @ModelAttribute("user") UserDetailsDto user,BindingResult result) throws PMSException {
		ModelAndView mv=null;
		if(result.hasErrors()) {
			System.out.println("In error");
			mv = new ModelAndView("/register_form","user",user);	
		}else {
			System.out.println("In add");
		  userDetailsService.add(user);
		  mv = new ModelAndView("redirect:/usersuccessMsg");  
		}
		return mv;
	}
	
	
	@GetMapping("/getall")
	public ModelAndView booksAction() throws PMSException {
		return new ModelAndView("admin/userList","users",userDetailsService.getAll());
	}
	
	
	@GetMapping("/usersuccessMsg")
	public String userSuccess() throws PMSException {
		return "userAddedSuccessMsg";
	}
	
	
}