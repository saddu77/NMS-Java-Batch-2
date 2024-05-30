package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String display(){
		return "hellopage";
	}
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcomepage";
	}	
}
