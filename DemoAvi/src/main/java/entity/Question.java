package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int queNum;
	private String queName;

	@ManyToMany(targetEntity = Answers.class, cascade = { CascadeType.ALL })  
	@JoinTable(name = "q_a1123")
	             
	private List<Answers> answers;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int queNum, String queName, List<Answers> answers) {
		super();
		this.queNum = queNum;
		this.queName = queName;
		this.answers = answers;
	}

	public int getQueNum() {
		return queNum;
	}

	public void setQueNum(int queNum) {
		this.queNum = queNum;
	}

	public String getQueName() {
		return queName;
	}

	public void setQueName(String queName) {
		this.queName = queName;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [queNum=" + queNum + ", queName=" + queName + ", answers=" + answers + "]";
	}

}
