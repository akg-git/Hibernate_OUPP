package edu.oupp.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regular_employee_table")
@DiscriminatorValue(value="regularemployee")
public class RegularEmployee extends Employee {

	@Column(name="salary")
	private float salary;
	@Column(name="bonus")
	private int bonus;
	
	//getters and setters
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
