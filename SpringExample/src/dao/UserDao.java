package dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import dto.UserDTO;

@Component("userDao")
public class UserDao implements IUserDao{
	
	@Autowired
	DataSource dataSource;
	
	public void saveUser(UserDTO userDTO){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into student(id, first_name,last_name) values (?,?,?)";
		int i = jdbcTemplate.update(sql,
				new Object[] { 
						userDTO.getId(), 
						userDTO.getFirstName(), 
						userDTO.getLastName() 
					});
		System.out.println("data inserted: "+i);
	}

	@Override
	public List<UserDTO> getAllUsers() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "select id, first_name, last_name, course from student";
		
		List<UserDTO> userList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
		
		return userList;
	}
}
