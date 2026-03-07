package com.sms.model;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private int age;
	private List<Course> cources;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Course> getCources() {
		return cources;
	}
	public void setCources(List<Course> cources) {
		this.cources = cources;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", cources="
				+ cources + "]";
	}
	public Student(int studentId, String studentName, int age, List<Course> cources) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.cources = cources;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
