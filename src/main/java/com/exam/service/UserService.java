package com.exam.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Admin;
import com.exam.model.User;
import com.exam.repository.AdminRepository;
import com.exam.repository.UserRepository;

@Service
public class UserService
{
	@Autowired
	UserRepository urepo;
	
	public User addUser(User user)
	{
		return urepo.save(user);
	}
	
	public boolean fetchUserByEmailAndPassword(String userEmail,String userPassword) 
	{
		System.out.println("hello"+userEmail);
		
	     User user=	urepo.findByUserEmailAndUserPassword(userEmail,userPassword);
	     urepo.findByUserEmailAndUserPassword(userEmail, userPassword);
	     if ((user.getUserPassword().equals(userPassword))&&(user.getUserEmail().equals(userEmail)))
	    	 return true;
	     else
	    	 return false;
			//return urepo.findByEmailAndPassword(userEmail, userPassword);
	}
	
	public List<User> showAllUser(){
		
		return urepo.findAll();
	}
}
