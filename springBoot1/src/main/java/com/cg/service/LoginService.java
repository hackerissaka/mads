package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.LoginDao;
import com.cg.exception.LoginException;
import com.cg.model.Login;

@Service
public class LoginService implements ILoginService {

	@Autowired
	private LoginDao loginDao;

	@Transactional
	@Override
	public Login saveDetails(Login log) throws LoginException {
		loginDao.save(log);
		return log;
	}

	@Override
	public Login getDetails(int id) throws LoginException {
	
		return loginDao.getUserDetails(id);
	}
	
	
}
