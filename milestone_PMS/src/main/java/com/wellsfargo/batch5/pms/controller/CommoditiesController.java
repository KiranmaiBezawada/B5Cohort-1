package com.wellsfargo.batch5.pms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/commodity")
public class CommoditiesController {
	List<String> commoditylist;
	@GetMapping
	public ModelAndView defaultAction() {
		return new ModelAndView("commodity","com",commoditylist);
	}
	
	@RequestMapping("/gold")
	public ModelAndView buyGoldAction(@RequestParam("buy")String buy) {
		if(commoditylist==null) {
			commoditylist = new ArrayList<>();
		}
		commoditylist.add(buy);
		return new ModelAndView("commodity","com",commoditylist);
	}

	
	@RequestMapping("/silver")
	public ModelAndView silverAction() {
		
		return new ModelAndView("commodity","com",commoditylist);
	}
	
	@RequestMapping("/Companies")
	public ModelAndView companiesAction() {
		return new ModelAndView("commodity","com",commoditylist);
	}


	
}
