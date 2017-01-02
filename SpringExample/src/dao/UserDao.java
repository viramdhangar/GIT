package dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao implements IUserDao{
	
	@Autowired
	DataSource dataSource;
	
	public void saveUser(String id, String firstName, String lastName){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into student(id, first_name,last_name) values (?,?,?)";
		int i = jdbcTemplate.update(sql, new Object[] {id,firstName,lastName});
		System.out.println("data inserted: "+i);
	}
	
}
