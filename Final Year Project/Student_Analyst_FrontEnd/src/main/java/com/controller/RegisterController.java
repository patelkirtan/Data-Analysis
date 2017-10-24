package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController 
{
	@RequestMapping (value = "/Register", method = RequestMethod.GET)
	public ModelAndView getRegister() {
		ModelAndView view = new ModelAndView ("Register");
		return view;
	}
}
