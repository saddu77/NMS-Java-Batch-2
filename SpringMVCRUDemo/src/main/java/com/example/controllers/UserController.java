package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.beans.User;
import com.example.dao.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	UserDAO dao;
	//	display a form to input data
	@RequestMapping("/userform")
	public String displayUserForm(Model model){
		model.addAttribute("command",new User());
		return "userform";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user")User user){
		dao.save(user);
		return "redirect:/listusers";
	}
	
	
	@RequestMapping("/listusers")
	public String listUsers(Model model){
		List<User> list= dao.getUsers();
		model.addAttribute("list",list);
		return "listusers";
	}
	
	@RequestMapping(value="/listuser/{id}")
	public String getUserById(@PathVariable int id, Model model){
		User user = dao.getUserById(id);
		model.addAttribute("command",user);
		return "edituserform";
	}
	
	@RequestMapping(value="/updateuser",method=RequestMethod.POST)
	public String updateUser(@ModelAttribute("user")User user){
		dao.update(user);
		return "redirect:/listusers";
	}
	
	@RequestMapping(value="/deleteuser/{id}")
	public String deleteUser(@PathVariable int id){
		dao.delete(id);
		return "redirect:/listusers";
	}
	
}
