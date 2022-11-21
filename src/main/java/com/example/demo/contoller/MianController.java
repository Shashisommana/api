package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.service.CourseService;

@RestController
public class MianController {
	
	@Autowired
	private CourseService cs;
	
	@GetMapping("/home")
	public String home() {
		
		
		return "HI welcome to home page";
	}
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		return this.cs.getCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.cs.getCourse(Long.parseLong(courseId));
		
	}
	
}
