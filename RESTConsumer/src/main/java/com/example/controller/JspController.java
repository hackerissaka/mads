package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspController {

	/*@RequestMapping(value="/welcome")
	public String showWelcomePage(Integer id, ModelMap model){
		
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject("http://localhost:9098/getmessage?id="+id, Message.class);
		System.out.println(message);
		model.put("message", message);
		return "welcome";
	}*/
	@RequestMapping(value="/welcome")
	public String wel() {
		return "welcome";
	}
}
