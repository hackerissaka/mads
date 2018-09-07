package com.cg.springBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.LoginException;
import com.cg.model.Login;
import com.cg.service.LoginService;

@RestController
public class LoginUserController {

	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Login saveDetails(@RequestBody Login l)throws LoginException{
		return service.saveDetails(l);
	}
	@RequestMapping(value="/getdetails",method=RequestMethod.GET)
	public Login loginDetails(int id)throws LoginException {
		return service.getDetails(id);
	}
}
