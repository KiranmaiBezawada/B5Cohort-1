package com.wellsfargo.batch5.pms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String loginAction() {
		return"commons/login";	
		
	}
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public ModelAndView dologinAction(@RequestParam("username")String userName,@RequestParam ("password")String password) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/UserPortfolio");
		mv.addObject("msg","Hello"+userName);
		
		return mv;	
		
	}
	
	
	


}