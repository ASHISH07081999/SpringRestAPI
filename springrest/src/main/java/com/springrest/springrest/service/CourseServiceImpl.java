package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.CourseDao;
import com.springrest.springrest.entity.course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<course> listcourse;  normal use without database JPA
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		
//		 listcourse= new ArrayList<>();
//		 listcourse.add(new course(123,"Ashish","this is ashish book"));
//		 listcourse.add(new course(124,"Ashish","this is ashish book"));
	}



	@Override
	public List<course> getCourse() {
		// TODO Auto-generated method stub
		
		//return listcourse;
	
		return courseDao.findAll();
	}
	

	@SuppressWarnings("deprecation")
	public course getCourse(long courseId) {
//		course c=null;
//		for (course course : listcourse) {
//			if(course.getCourse_Id()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		
//		return c;
		
		return courseDao.getOne(courseId);
		
	}
	
	public course putCourse(course course) {
		
//		listcourse.add(course);
//		return course;
		
		return courseDao.save(course);
	}
	
	public course updateCourse(course course) {
//		listcourse.forEach(e -> {
//			if(e.getCourse_Id() == course.getCourse_Id()) {
//				e.setDescription(course.getDescription());
//				e.setTitle(course.getTitle());
//			}
//		});
		
//		for (course course1 : listcourse) {
//			if(course1.getCourse_Id()==course.getCourse_Id()) {
//				course1.setDescription(course.getDescription());
//				course1.setTitle(course.getTitle());
//			}
//			
//		}
//		return course;
		
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
		//listcourse=this.listcourse.stream().filter(e->e.getCourse_Id()!=parseLong).collect(Collectors.toList());
		
		course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	
	}
	

}
