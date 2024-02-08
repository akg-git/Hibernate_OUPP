package gov.edu.oupp.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AlienClass {
	
	@Id
	private int aid;
	private String aname;
	private String tech;
	
	//getters and setters
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "AlienClass [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	

}
