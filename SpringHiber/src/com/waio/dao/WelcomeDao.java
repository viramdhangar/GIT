package com.waio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.waio.dto.Welcome;

@Component("WelcomeDao")
public class WelcomeDao {

	/*@Autowired
	private SessionFactory sessionFactory;*/
	@Autowired
	HibernateTemplate template; 
	
	@Transactional
	public boolean save(Welcome wel){
		//sessionFactory.getCurrentSession().save(wel);
		template.save(wel);
		return true;
	}
}
