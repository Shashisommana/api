package com.example.demo.entities;

public class Courses {

	private long id;
	private String title;
	private String info;
	public Courses(long id, String title, String info) {
		super();
		this.id = id;
		this.title = title;
		this.info = info;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", info=" + info + "]";
	}
	
	
}
