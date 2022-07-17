package com.cascade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	@Id
	@Column(name = "answer_id")
private int answerId;
private String answers;

@ManyToOne
private Questionn questionn;


public int getAnswerId() {
	return answerId;
}


public void setAnswerId(int answerId) {
	this.answerId = answerId;
}


public String getAnswers() {
	return answers;
}


public void setAnswers(String answers) {
	this.answers = answers;
}


public Questionn getQuestionn() {
	return questionn;
}


public void setQuestionn(Questionn questionn) {
	this.questionn = questionn;
}


public Answers(int answerId, String answers, Questionn questionn) {
	super();
	this.answerId = answerId;
	this.answers = answers;
	this.questionn = questionn;
}


public Answers() {
	super();
	// TODO Auto-generated constructor stub
}

}
