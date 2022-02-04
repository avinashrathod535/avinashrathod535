package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Acount {
	@Id
	private int aid;
	private String aName;
	private int aNum;
	public Acount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acount(int aid, String aName, int aNum) {
		super();
		this.aid = aid;
		this.aName = aName;
		this.aNum = aNum;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public int getaNum() {
		return aNum;
	}
	public void setaNum(int aNum) {
		this.aNum = aNum;
	}
	@Override
	public String toString() {
		return "Acount [aid=" + aid + ", aName=" + aName + ", aNum=" + aNum + "]";
	}
	
	

}
