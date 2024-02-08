/**
 * 
 */
package gov.edu.oupp.hibernate.java.entity;

/**
 * @author Asish Kumar Gouda
 *
 */


public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	//constructors
	
	public Employee(){}
	
	
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	//getters ans setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
