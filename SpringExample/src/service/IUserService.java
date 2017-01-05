package service;

import java.util.List;

import dto.UserDTO;

public interface IUserService {

	public void addUser(UserDTO userDTO);
	public List<UserDTO> getAllUsers();
	public List<UserDTO> getUserById(String id);
	public int deleteUser(String id);
	public int editUser(UserDTO user);
}
