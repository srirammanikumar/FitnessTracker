package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model){
		
		model.addAttribute("wish", "Hello World");
		
		return "hello"; // this should be the name of the jsp.. "hello.jsp"
	}
}
