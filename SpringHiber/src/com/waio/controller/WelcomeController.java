package com.waio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.waio.dto.Welcome;
import com.waio.service.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody ModelAndView welcome() throws Exception {
		
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value = "/saveForm", method = RequestMethod.POST)
	public @ResponseBody ModelAndView saveWelcome(@RequestParam("name") String name) throws Exception {
		
		Welcome wel = new Welcome();
		wel.setName(name);
		
		welcomeService.save(wel);
		
		return new ModelAndView("welcome");
	}
}
