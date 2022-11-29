package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Courses;

import ch.qos.logback.core.subst.Token;

public interface CourseService {

	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses courses);
	public List<Token> getToken();
	
}
