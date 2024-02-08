/**
 * 
 */
package gov.edu.oupp.HibernateDemo;

import javax.persistence.Embeddable;

/**
 * @author Asish Kumar Gouda
 *
 */

@Embeddable
public class PeopleGrossSalary {
	
	private double hra;
	private double da;
	private double increment;
	
	//getters and setters
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getIncrement() {
		return increment;
	}
	public void setIncrement(double increment) {
		this.increment = increment;
	}
	
	
	@Override
	public String toString() {
		return "PeopleGrossSalary [hra=" + hra + ", da=" + da + ", increment=" + increment + "]";
	}
	
	

}
