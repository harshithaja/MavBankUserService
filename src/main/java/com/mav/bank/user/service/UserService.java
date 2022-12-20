package com.mav.bank.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mav.bank.user.dao.UserRepository;
import com.mav.bank.user.entity.User;


@Component
public class UserService 
{
private static final String USERNOTFOUND = "User not in system";

	
	@Autowired
	private UserRepository userRepository;

	
	// Adding user
	public User addUser(User user) 
	{
		User result = userRepository.save(user);
		return result;
	}

	//update user
	public User updateUser(User user, int id) 
	{
		User user_updated=null;
		user.setId(id);
	    user_updated=userRepository.save(user);
	    return user_updated;
	}
	
	//delete user
	public void deleteUser(int userid) 
	{
		userRepository.deleteById(userid);
	}
	
	
	public User getUserById(int id)
	{
		User user = null;
		user =  userRepository.findById(id);
		return user;
	}

	public User getUserByEmail(String email) 
	{
		User user = null;
		user = userRepository.findByEmail(email);
		return user;

	}
		
}
