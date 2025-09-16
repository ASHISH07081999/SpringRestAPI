package com.springrest.springrest.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	
	//for test purpose
	
	@GetMapping("/home")
	public String home() {
		
		return "This is home page";
		
	}
		
	//get courses details
	
	@GetMapping("/courses")
	public List<course> getCourse(){
		
		return this.courseService.getCourse();
		
		}
	
	//get course detail based on particular id
	
	@GetMapping("/courses/{courseid}")
	public course getCourses(@PathVariable String courseid) {
		
		return this.courseService.getCourse(Long.parseLong(courseid));
		
	}
	
	//put add new deatils in course in Json format
	
	@PostMapping("/courses")
	public course putCourses(@RequestBody course course) {
		
		return this.courseService.putCourse(course);
		
	}
	
	//update details of particular courseId 
	
	@RequestMapping(value = "/courses", method = RequestMethod.PUT)
	public course updateCourse(@RequestBody course course) {
		
		return this.courseService.updateCourse(course);
	}
	
	//delete the particular case
	
	@DeleteMapping("/courses/{courseId}")
	public  ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		
		try{
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	

}
