package service;

import java.util.List;

import dto.UserDTO;

public interface IUserService {

	public void addUser(UserDTO userDTO);
	public List<UserDTO> getAllUsers();
}
