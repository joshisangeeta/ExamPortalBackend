package com.exam.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
	
	Admin findByAdminNameAndAdminEmail(String adminName, String adminEmail);

}
