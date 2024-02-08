/* TABLE PER CONCRETE CLASS (CONCRETE TABLE INHERITANCE) */

package edu.oupp.entity2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee_two_table")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp2_id")
	private int id;
	@Column(name="emp2_name")
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
