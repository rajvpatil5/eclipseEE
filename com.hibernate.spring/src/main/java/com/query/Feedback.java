package com.query;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Feedback {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "feedback_id")
	private int id;

	private String comments;

	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "lesson_id")
	private Lesson lesson;
	
	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public String getComment() {
		return comments;
	}

	public void setComment(String comments) {
		this.comments = comments;
	}


}
