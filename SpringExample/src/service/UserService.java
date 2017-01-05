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

	@Override
	public List<UserDTO> getUserById(String id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	@Override
	public int deleteUser(String id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	@Override
	public int editUser(UserDTO user) {
		// TODO Auto-generated method stub
		return userDao.editUser(user);
	}
}
