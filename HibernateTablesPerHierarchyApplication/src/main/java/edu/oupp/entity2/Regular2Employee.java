package edu.oupp.entity2;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regular_two_employee")
@AttributeOverrides({
	@AttributeOverride(name="emp2_id", column=@Column(name="emp2_id")),
	@AttributeOverride(name="emp2_name", column=@Column(name="emp2_name"))
})
public class Regular2Employee {
	
	@Column(name="salary")
	private float salary;
	@Column(name="bonus")
	private int bonus;
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
