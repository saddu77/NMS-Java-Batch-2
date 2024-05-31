package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.User_DAO;
import com.example.model.User;

@Service
@Transactional
public class User_Service_Imp implements User_Service {
 
	@Autowired
	private User_DAO userdao;
	
	@Override
	public boolean saveUser(User user) {
		return userdao.saveUser(user);
	}

	@Override
	public List<User> getUsers() {
		return userdao.getUsers();
	}

	@Override
	public boolean deleteUser(User user) {
		return userdao.deleteUser(user);
	}

	@Override
	public List<User> getUserByID(User user) {
		return userdao.getUserByID(user);
	}

	@Override
	public boolean updateUser(User user) {
		return userdao.updateUser(user);
	}

}
