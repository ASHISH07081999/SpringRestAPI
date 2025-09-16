package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.course;

public interface CourseService {

	public List<course> getCourse();

	public course getCourse(long courseId);

	public course putCourse(course course);

	public course updateCourse(course course);

	public void deleteCourse(long parseLong);
}
