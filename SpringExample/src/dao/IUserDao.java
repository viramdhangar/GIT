package dao;

import java.util.List;

import dto.UserDTO;

public interface IUserDao {

	public void saveUser(UserDTO userDTO);
	public List<UserDTO> getAllUsers();
	public List<UserDTO> getUserById(String id);
	public int deleteUser(String id);
	public int editUser(UserDTO user);
}
