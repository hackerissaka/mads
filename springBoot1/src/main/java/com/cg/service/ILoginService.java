package com.cg.service;

import com.cg.exception.LoginException;
import com.cg.model.Login;

public interface ILoginService {

	Login saveDetails(Login log)throws LoginException;
	Login getDetails(int id)throws LoginException;
}
