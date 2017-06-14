package com.anup.springbootstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstSpringController {
	
	@RequestMapping("/")
	public String greetCaller(){
		return("hello");
		
	}

}
