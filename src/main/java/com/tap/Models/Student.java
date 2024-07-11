package com.tap.Models;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
@Table(name="student")
@Entity

public class Student {
	@Id
	@Column(name="id")
		int id ;
	@Column(name="name")
	    String name ;
	@Column(name="email")
	    String Email;
	@Column(name="dept")
	String Department;
	@Column(name="percentage")
	int percentage;
	public Student()
	{
		
	}
	public Student(int id, String name, String email, String department, int percentage) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		Department = department;
		this.percentage = percentage;
	}
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	public String toString()
	{
		return id + " "+name+" "+ Email +" "+Department+" "+percentage;
	}
	
	
	

}
