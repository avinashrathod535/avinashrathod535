package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a1123")
public class Answers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ansNum;
	private String answerName;
	private String ansgivenby;

	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answers(int ansNum, String answerName, String ansgivenby) {
		super();
		this.ansNum = ansNum;
		this.answerName = answerName;
		this.ansgivenby = ansgivenby;
	}

	public int getAnsNum() {
		return ansNum;
	}

	public void setAnsNum(int ansNum) {
		this.ansNum = ansNum;
	}

	public String getAnswerName() {
		return answerName;
	}

	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	public String getAnsgivenby() {
		return ansgivenby;
	}

	public void setAnsgivenby(String ansgivenby) {
		this.ansgivenby = ansgivenby;
	}

	@Override
	public String toString() {
		return "Answers [ansNum=" + ansNum + ", answerName=" + answerName + ", ansgivenby=" + ansgivenby + "]";
	}

}
