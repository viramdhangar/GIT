package dao;

import java.util.List;

import dto.UserDTO;

public interface IUserDao {

	public void saveUser(UserDTO userDTO);
	public List<UserDTO> getAllUsers();
}
