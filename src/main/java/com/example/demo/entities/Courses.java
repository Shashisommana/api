package com.example.demo.entities;

//import java.util.List;

public class Courses {

	private long id;
	private String title;
	private String info;
	private String Token;
	public Courses(long id, String title, String info,boolean b) {

		this.id = id;
		this.title = title;
		this.info = info;
		this.Token = getToken();
	}
	public Courses() {
		super();
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", info=" + info + ", Token=" + Token + "]";
	}
	
	
	
}
