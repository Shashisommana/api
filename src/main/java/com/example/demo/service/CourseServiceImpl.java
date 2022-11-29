package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;

import ch.qos.logback.core.subst.Token;
@Service
public class CourseServiceImpl implements CourseService{

	List<Courses> list;
	List<Token> l;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(123,"java ","for backend",l.addAll(getToken())));
		list.add(new Courses(1245,"web ","for frontend",l.addAll(getToken())));
		list.add(new Courses(1256,"devops ","cloud service",l.addAll(getToken())));
		list.add(new Courses(124576,"nothing ","simply waste",l.addAll(getToken())));
	}


	@Override
	public List<Courses> getCourses() {

		return list;
	}


	@Override
	public Courses getCourse(long courseId) {
		Courses c=null;
		for(Courses co:list) {
			if(co.getId()==courseId)
			{
				c=co;
				break;
			}
		}
		return c;
	}


	@Override
	public Courses addCourse(Courses courses) {
		list.add(courses);
		return courses;
	}


	@Override
	public List<Token> getToken() {

		l= new ArrayList<Token>();
		l.addAll(getToken());
		return l;

	}
}
