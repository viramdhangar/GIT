package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserDao;
import dto.UserDTO;

@Service("userService")
public class UserService implements IUserService{
	
	@Autowired
	IUserDao userDao;
	
	public void addUser(UserDTO userDTO){
		userDao.saveUser(userDTO);
	}

	@Override
	public List<UserDTO> getAllUsers() {
		return userDao.getAllUsers();
	}
}
