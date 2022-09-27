package com.ty.school.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "school_app_Teacher_hibernate")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "teach_Name")
	private String name;
	@Column(name = "teach_Email", nullable = false)
	private String email;
	@Column(name = "teach_Password", unique = true)
	private String password;
	@Column(name = "teach_Subject")
    private String subject;
    
    
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
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
    
	
    
}

