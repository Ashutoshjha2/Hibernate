package com.manytoone;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Questionn {
	@Id
	@Column(name = "question_id")
	private int questionId;
	private String questionn;
	@OneToMany(mappedBy = "questionn",fetch = FetchType.EAGER)
private List<Answers>answers;

	
	public int getQuestionId() {
		return questionId;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	public String getQuestionn() {
		return questionn;
	}


	public void setQuestionn(String questionn) {
		this.questionn = questionn;
	}


	public List<Answers> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}


	public Questionn(int questionId, String questionn, List<Answers> answers) {
		super();
		this.questionId = questionId;
		this.questionn = questionn;
		this.answers = answers;
	}


	public Questionn() {
		super();
		// TODO Auto-generated constructor stub
	}

}
