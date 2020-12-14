package com.wellsfargo.batch5.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.wellsfargo.batch5.pms.model.UserDetailsModel;

@Controller
@RequestMapping("/register")
public class UserDetailsController {
		
		@GetMapping
		public ModelAndView registerAction() {
			return new ModelAndView("commons/register","userde",new UserDetailsModel());
		}

   @PostMapping
	public ModelAndView doregisterAction(@ModelAttribute UserDetailsModel userde) {
		return new ModelAndView("/UserPortfolio","userde",userde);

}
   
   
   
   
}