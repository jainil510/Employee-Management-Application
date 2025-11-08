package com.jainil.employeemanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Column(name = "first_name")
	private String firstName;

	@NotBlank
	@Column(name = "last_name")
	private String lastName;
	
	@Email
	@NotBlank
	@Column(name = "email_id")
	private String emailId;

	@NotBlank
	@Column(name = "department")
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
