package com.example.controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.beans.Message;
import com.example.beans.Quote;
import com.example.beans.Sender;

@RestController
public class RestConsumer {

	
	@RequestMapping("/")
	public String consume(){
		return "REST Consumer";
	}
	@RequestMapping("/wel")
public ModelMap showWelcomePage(Integer id, ModelMap model){
		
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject("http://localhost:9098/getmessage?id="+id, Message.class);
		System.out.println(message);
		model.put("message", message);
		return model;
	}
	@RequestMapping(value="/quote")
	public Quote consumeQuote(){
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		return quote;
	}
	
	@RequestMapping(value="/message")
	public Message consumeMessage(){
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject("http://localhost:9098/getmessage?id=2", Message.class);
		
		
		return message;
	}
	
	@RequestMapping(value="/send")
	public Message sendMessage(){
		Message m = new Message();
		m.setText("Java client Posting message");
		m.setSender(new Sender("Java Client"));
		System.out.println(m);
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.postForObject("http://localhost:9098/receive",m, Message.class);
		
		return message;
	}
	
}
