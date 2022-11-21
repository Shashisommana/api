package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService{

	List<Courses> list;
	
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(123,"java ","for backend"));
		list.add(new Courses(1245,"web ","for frontend"));
		list.add(new Courses(1256,"devops ","cloud service"));
		list.add(new Courses(124576,"nothing ","simply waste"));
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

}
