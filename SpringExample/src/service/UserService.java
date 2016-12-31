package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;

@Service("userService")
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(String id, String firstName, String lastName){
		userDao.saveUser(id,firstName,lastName);
	}
}
