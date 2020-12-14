package com.wellsfargo.batch5.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/commons")
public class CommonController {
	@RequestMapping("/header")
	public String headerAction() {
		return"commons/header-segment";
	}
	
	@RequestMapping("/header2")
	public String header2Action() {
		return"commons/header-segment2";
	}
	
	@RequestMapping("/contactus")
	public ModelAndView contactUsAction() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("commons/contact_us");
		mv.addObject("Mobile","998877654");
		mv.addObject("Mail","FullStack@iiht.com");
		
		return mv;
	}
	
	@RequestMapping("/Register")
	public String registerAction() {
		return"commons/register";
	}

}
