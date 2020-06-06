package com.chinasoft.pojo;

import java.util.List;

public class Gender {
	private int id;
	private String c_name;
	private String c_teacher;
	private List<Student> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_teacher() {
		return c_teacher;
	}
	public void setC_teacher(String c_teacher) {
		this.c_teacher = c_teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Gender(int id, String c_name, String c_teacher, List<Student> students) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.c_teacher = c_teacher;
		this.students = students;
	}
	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Gender [id=" + id + ", c_name=" + c_name + ", c_teacher=" + c_teacher + ", students=" + students + "]";
	}
	

}
