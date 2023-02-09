package com.onlyjavatech.Zeeshan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/* @ResponseBody */
public class TestController {
	@RequestMapping("/Hello")
	public String firstHandler()
	{
		System.out.println("Hello conttroller Executed !!");
		return "Hello";
		
	}
	

}
