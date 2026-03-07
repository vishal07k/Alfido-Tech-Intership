package com.sms.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import com.sms.model.Course;
import com.sms.model.Student;

public class StudentService {

	private static List<Student> studentDB = new LinkedList<>();
	private static final HashMap<Integer, Course> cources = new HashMap<>();
	
	static {
		cources.put(1, Course.ENGLISH);
		cources.put(2, Course.HINDI);
		cources.put(3, Course.HYSTORY);
		cources.put(4, Course.IT);
		cources.put(5, Course.SCIENCE);
	}
	
	public static String saveStudent(Student student) {
		if(student.getStudentName().isEmpty()) {
			throw new RuntimeException("Student name should not be empty !");
		}
		if(student.getAge() <=6 && student.getAge() >=30) {
			throw new RuntimeException("Student Age should be between 6-30 !");
		}
		studentDB.add(student);
		return "Student has been added to the systems!";
	}
	
	public static List<Student> getAllStudents(){
		return studentDB;
	}
	
	
	public static String deleteStudent(String studentName) {
		boolean result = false;
		Student student = searchStudent(studentName);
		if(student != null) {
			studentDB.remove(student);
			result = true;
		}
		if(result == false) {
			return "Please verify student name !";
		}
		return "Student has been removed from the system !";
	}
	
	public static Student updateStudent(Student student) {
		
		Student existingStudent = searchStudent(student.getStudentName());
		if(existingStudent == null) {
			throw new RuntimeException("Student not found");
		}
		deleteStudent(existingStudent.getStudentName());
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setAge(student.getAge());
		existingStudent.setCources(student.getCources());
		studentDB.add(existingStudent);
		return existingStudent;
	}
	
	public static Student searchStudent(String studentName) {
		Student student = new Student();
		for(Student s : studentDB) {
			if(s.getStudentName().equals(studentName)) {
				student = s;
			}
		}
		return student;
	}
	public static List<Course> assignCources(int options[]){
		List<Course> assignCources = new LinkedList<>();
		
		for(int i = 0; i < options.length; i++) {
			
			if(options[i] == 1){
			assignCources.add(cources.get(i+1));
			}
		}
		
		return assignCources;
			
	}
}
