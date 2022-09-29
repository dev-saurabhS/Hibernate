package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {

	@Id
	private int id;
	private String Pan_number;
	private String type;
	@OneToOne(mappedBy = "pan")
	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPan_number() {
		return Pan_number;
	}

	public void setPan_number(String pan_number) {
		Pan_number = pan_number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
