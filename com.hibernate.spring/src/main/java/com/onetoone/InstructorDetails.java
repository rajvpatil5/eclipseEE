package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="instructor_details")
public class InstructorDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="instructor_details_id")
	private int instructorDetailsId;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	private String hobbies;
	
	@OneToOne(cascade = {CascadeType.MERGE},mappedBy="instructorDetailsId")
	private Instructor instructor;

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public int getInstructorDetailsId() {
		return instructorDetailsId;
	}

	public void setInstructorDetailsId(int instructorDetailsId) {
		this.instructorDetailsId = instructorDetailsId;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

}
