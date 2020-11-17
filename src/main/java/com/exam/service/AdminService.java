package com.exam.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Admin;
import com.exam.model.User;
import com.exam.repository.AdminRepository;
import com.exam.repository.UserRepository;

@Service
public class AdminService 
{
	@Autowired
	AdminRepository arepo;
	
	public Admin addAdmin(Admin admin)
	{
		return arepo.save(admin);
	}
	
	public boolean fetchAdminByNameAndEmail(String adminName,String adminEmail) 
	{
		System.out.println("hello"+adminName);
		
	     Admin admin=arepo.findByAdminNameAndAdminEmail(adminName, adminEmail);
	     arepo.findByAdminNameAndAdminEmail(adminName, adminEmail);
	     
	     if ((admin.getAdminName().equals(adminName))&&(admin.getAdminEmail().equals(adminEmail)))
	    	 return true;
	     else
	    	 return false;
			//return urepo.findByEmailAndPassword(userEmail, userPassword);
	}
}