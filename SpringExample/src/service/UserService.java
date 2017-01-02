package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserDao;

@Service("userService")
public class UserService implements IUserService{
	
	@Autowired
	IUserDao userDao;
	
	public void addUser(String id, String firstName, String lastName){
		userDao.saveUser(id,firstName,lastName);
	}
}
