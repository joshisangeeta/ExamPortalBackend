package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Question;
import com.exam.repository.QuestionRepository;
@Service
public class QuestionService {
	@Autowired
	QuestionRepository qrepo;
	public Question addQuestion(Question q) {
		
		return qrepo.save(q);
	}
	
	public List<Question> showAllQuestion(){
		
		return qrepo.findAll();
	}
	
	public void deleteQuestion(int qid) {
		qrepo.deleteById(qid);
		
	}

}
