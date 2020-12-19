package com.wellsfargo.batch5.pms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class SecurityController {
	
	/*@Autowired
	private UserDetailsServiceImpl userService;*/
	
	@GetMapping("/login")
	public String gotoLogin() {
		String view="login-form";
		
		/*
		 * System.out.println("Befor auth"); Authentication auth =
		 * SecurityContextHolder.getContext().getAuthentication();
		 * System.out.println("After auth"); System.out.println(auth.isAuthenticated());
		 * System.out.println(auth instanceof AnonymousAuthenticationToken);
		 */
		
		
		/*
		 * if (!(auth instanceof AnonymousAuthenticationToken) &&
		 * auth.isAuthenticated()) { System.out.println("In jsp");
		 * view="redirect:/home"; }
		 */

		return view; 
	}
	
	@GetMapping({"","/","/home"})
	public String LoginAction() {
		return "index";
	}
	
	
	
	
}
