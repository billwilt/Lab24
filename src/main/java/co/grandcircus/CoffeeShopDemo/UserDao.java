package co.grandcircus.CoffeeShopDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShopDemo.beans.User;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbc;
	
	public void addUser(User user) {
		
		String sql = "INSERT INTO `coffee_shop_demo`.`user` (`first_name`, `last_name`, `email`, `phone_number`, `password`) VALUES (?, ?, ?, ?, ?)";
		jdbc.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber(), user.getPassword());
		return;
	}
	
	

}
