package br.com.rafaelsonego.mavenProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class LoginController {

	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView execute() {
		return new ModelAndView("public/login");
	}
	
	@RequestMapping(method = {RequestMethod.POST}, value = "validateLogin")
	public ModelAndView validateLogin() {
		//Only redirect to your page Login. Here, the class AuthInterceptor will work
		return new ModelAndView("protected/index");
	}
	
}