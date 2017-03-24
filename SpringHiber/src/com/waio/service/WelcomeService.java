package com.waio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waio.dao.WelcomeDao;
import com.waio.dto.Welcome;

@Service("WelcomeService")
public class WelcomeService {

	@Autowired
	private WelcomeDao welcomeDao;
	
	public boolean save(Welcome wel){
		
		welcomeDao.save(wel);
		return true;
	}
	
}
