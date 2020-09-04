package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Instructor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="instructor_id")
	private int instructorId;
	private String Name;
	private String email;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_details_id")
	private InstructorDetails instructorDetailsId;

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetails getInstructorDetailsId() {
		return instructorDetailsId;
	}

	public void setInstructorDetailsId(InstructorDetails instructorDetailsId) {
		this.instructorDetailsId = instructorDetailsId;
	}

}
