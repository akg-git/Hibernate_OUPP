/**
 * 
 */
package gov.edu.oupp.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Asish Kumar Gouda
 *
 */

@Entity
@Table
public class People {
	
	//primary key: @Id
	@Id
	private int id;
	private String name;
	private PeopleGrossSalary salary;
	
	//getters and setters
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
	
	public PeopleGrossSalary getSalary() {
		return salary;
	}
	public void setSalary(PeopleGrossSalary salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
