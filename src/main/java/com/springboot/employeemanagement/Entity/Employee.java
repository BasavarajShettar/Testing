package com.springboot.employeemanagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee 
{
	
	public Employee() {
		super();
		this.id = id;
		this.firstName = firstName;
//		this.lastName = lastName;
		this.salary = salary;
		this.designation = designation;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
@Column(name = "first_name")	
private String firstName;

//@Column(name = "last_name")
//private String lastName;

@Column(name = "Salary")
private long salary;	

@Column(name="designation")
private String designation;


public int getId() {
	return id;
}
public void setId(int i) {
	this.id = i;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
//public String getLastName() {
//	return lastName;
//}
//public void setLastName(String lastName) {
//	this.lastName = lastName;
//}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName +  ", salary=" + salary
			+ ", designation=" + designation + "]";
}

}