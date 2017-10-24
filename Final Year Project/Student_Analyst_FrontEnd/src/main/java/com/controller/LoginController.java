package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController 
{
	@RequestMapping (value = "/Login", method = RequestMethod.GET)
	public ModelAndView getPagelog() {
		ModelAndView view = new ModelAndView ("Login");
		return view;
	}
	
	/*@RequestMapping(value="/Login")
	public String Login()
	{
		return "Login";
	}*/
}
