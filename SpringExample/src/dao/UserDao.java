package dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {
	
	@Autowired
	DataSource dataSource;
	
	public void saveUser(String id, String firstName, String lastName){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into user(id, firstName,lastName) values (?,?,?)";
		jdbcTemplate.update(sql, new Object[] {id,firstName,lastName});
	}
}
