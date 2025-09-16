package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course {
	
	@Id
	private long course_Id;
	private String title;
	private String description;
	public course(long course_Id, String title, String description) {
		super();
		this.course_Id = course_Id;
		this.title = title;
		this.description = description;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(long course_Id) {
		this.course_Id = course_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "course [course_Id=" + course_Id + ", title=" + title + ", description=" + description + "]";
	}
	

}
