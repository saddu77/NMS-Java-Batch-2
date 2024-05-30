package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.beans.User;

public class UserDAO {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	//create a new user in users table with springmvcdb 
	public int save(User user){
		String query = "insert into users(id,username,password) values('"+user.getId()+"','"+user.getUsername()+"','"+user.getPassword()+"')";
		return template.update(query);
	}
	
	//Read all Users
	public List<User> getUsers(){
		return template.query("select * from users", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				return u;
			}			
		});		
	}
	
	//Read User by Id
	public User getUserById(int id){
		String query = "select * from users where id=?";
		return template.queryForObject(query, new Object[]{id},new BeanPropertyRowMapper<User>(User.class));
	}
	
	//Update User
	public int update(User user){
		String query = "update users set username='"+user.getUsername()+"',password='"+user.getPassword()+"' where id="+user.getId()+"";
		return template.update(query);
	}
	
	//Delete User by Id
	public int delete(int id){
		String query = "delete from users where id="+id+"";
		return template.update(query);
		
	}
}
