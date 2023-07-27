package com.swadeshNayak.learnspringboot.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swadeshNayak.learnspringboot.course.bin.Course;

@RestController
public class CourseController {
	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1, "Learn Micoservices", "swadesh"),
				new Course(2, "Learn Spring Boot", "Swadesh2"));
		
	}
	//http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getCourseDetails1(){
		return new Course(1, "Learn Microservices", "Swadesh");
		
	}
	//http://localhost:8080/courses/2
		@GetMapping("/courses/2")
		public Course getCourseDetails2(){
			return new Course(2, "Learn Spring Boot", "Swadesh");
	}

}
