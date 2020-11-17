package com.exam.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Admin;
import com.exam.model.Question;
import com.exam.model.User;
import com.exam.service.AdminService;
import com.exam.service.QuestionService;
import com.exam.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/web")
public class ExamController {
	
	@Autowired
	UserService uservice;
	
	@Autowired
	AdminService aservice;
	
	@Autowired
	QuestionService qservice;
	
	
	@PostMapping(value="/adduser")
	public User addUser(@RequestBody User u) {
	return uservice.addUser(u);
	}
	
	@PostMapping(value="/loginuser")
	public boolean loginUser(@RequestBody User u) throws Exception {
		String tempEmailId=u.getUserEmail();
		String tempPassword=u.getUserPassword();
		return uservice.fetchUserByEmailAndPassword(tempEmailId, tempPassword);
	}

	@PostMapping(value="/addadmin")
	public Admin addAdmin(@RequestBody Admin a) {
	return aservice.addAdmin(a);
	}
	
	@PostMapping(value="/loginadmin")
	public boolean loginAdmin(@RequestBody Admin a) throws Exception {
		String tempEmailId=a.getAdminEmail();
		String tempName=a.getAdminName();
		return aservice.fetchAdminByNameAndEmail(tempName, tempEmailId);
	}
	
	@GetMapping(value="/viewstudents")
	public List<User> viewAllUser() {
	return uservice.showAllUser();
	}
	
	@PostMapping(value="/addquestion")
	public Question addQuestion(@RequestBody Question q) {
		
		return qservice.addQuestion(q);
	}
	
	@GetMapping(value="/viewallquestion")
	public List<Question> getAllQuestion(){
		
		return qservice.showAllQuestion();
	}
	
	@PostMapping(value="/deletequestion")
	public List<Question> deleteQuestion(@PathVariable int qid) {
		qservice.deleteQuestion(qid);
		return qservice.showAllQuestion();
	}

}
