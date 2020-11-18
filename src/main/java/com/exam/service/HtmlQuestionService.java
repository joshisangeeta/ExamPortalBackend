package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.HtmlQuestion;
import com.exam.model.Question;
import com.exam.repository.HtmlQuestionRepository;

@Service
public class HtmlQuestionService {

	@Autowired
	HtmlQuestionRepository hrepo;
	
	public HtmlQuestion addHQuestion(HtmlQuestion h) {
		
		return hrepo.save(h);
	}
	
	public List<HtmlQuestion> showAllHQuestion(){
		
		return hrepo.findAll();
	}
	
	public void deleteHQuestion(int qid) {
		hrepo.deleteById(qid);
		
	}
	
}
