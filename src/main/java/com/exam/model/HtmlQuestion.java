package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HtmlQuestion {

	@Id
	@GeneratedValue()
	int qid;
	String questions;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	String correctAns;
	public HtmlQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HtmlQuestion(int qid, String questions, String optionA, String optionB, String optionC, String optionD,
			String correctAns) {
		super();
		this.qid = qid;
		this.questions = questions;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctAns = correctAns;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getCorrectAns() {
		return correctAns;
	}
	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctAns == null) ? 0 : correctAns.hashCode());
		result = prime * result + ((optionA == null) ? 0 : optionA.hashCode());
		result = prime * result + ((optionB == null) ? 0 : optionB.hashCode());
		result = prime * result + ((optionC == null) ? 0 : optionC.hashCode());
		result = prime * result + ((optionD == null) ? 0 : optionD.hashCode());
		result = prime * result + qid;
		result = prime * result + ((questions == null) ? 0 : questions.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HtmlQuestion other = (HtmlQuestion) obj;
		if (correctAns == null) {
			if (other.correctAns != null)
				return false;
		} else if (!correctAns.equals(other.correctAns))
			return false;
		if (optionA == null) {
			if (other.optionA != null)
				return false;
		} else if (!optionA.equals(other.optionA))
			return false;
		if (optionB == null) {
			if (other.optionB != null)
				return false;
		} else if (!optionB.equals(other.optionB))
			return false;
		if (optionC == null) {
			if (other.optionC != null)
				return false;
		} else if (!optionC.equals(other.optionC))
			return false;
		if (optionD == null) {
			if (other.optionD != null)
				return false;
		} else if (!optionD.equals(other.optionD))
			return false;
		if (qid != other.qid)
			return false;
		if (questions == null) {
			if (other.questions != null)
				return false;
		} else if (!questions.equals(other.questions))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HtmlQuestion [qid=" + qid + ", questions=" + questions + ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", optionD=" + optionD + ", correctAns=" + correctAns + "]";
	}
	
	
	
}
