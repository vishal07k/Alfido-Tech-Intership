package com.sms;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.sms.model.Course;
import com.sms.model.Student;
import com.sms.service.StudentService;

public class StudentManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int choice = 0;
		
		do {
			System.out.println("Welcome to Student Management System !");
			System.out.println("--------------------------------------");
			System.out.println("1. Enrole student   <-");
			System.out.println("2. Display students <-");
			System.out.println("3. Remove student   <-");
			System.out.println("4. Update Student   <-");
			System.out.println("5. Search Student   <-");
			System.out.println("6. Exit             <-");
			System.out.println("--------------------------------------");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				Student student = new Student();
				Random randm = new Random();
				student.setStudentId(randm.nextInt(1000));
				System.out.println("Enter student name :");
				String name = sc.next();
				student.setStudentName(name);
				System.out.println("Enter student Age :");
				int age = sc.nextInt();
				student.setAge(age);
				int options[] = new int[5];
				System.out.println("Please Enter subject choice (EX. 0(False)-1(True)) :");
				System.out.println("1. English 2. Hindi 3. Hystory 4. IT 5. Science");
				int subjectChoice = 0;
				for(int i = 0; i < 5; i++) {
				System.out.println("Enter choice for option " + (i + 1) + " :");
				subjectChoice = sc.nextInt();
				if(subjectChoice !=0 && subjectChoice !=1) {
					throw new RuntimeException("Please choose between 0-1");
				}
				options[i] = subjectChoice;
				}
				List<Course> selectedCources = StudentService.assignCources(options);
				student.setCources(selectedCources);
				String response = StudentService.saveStudent(student);
				System.out.println(response);
				break;
			
			case 2 : 
				List<Student> students = StudentService.getAllStudents();
				System.out.println("Student Details : ");
				System.out.println("-----------------------------------");
				for(Student s : students) {
					System.out.println("Student Id : " + s.getStudentId());
					System.out.println("Student Name : " + s.getStudentName());
					System.out.println("Student Age : " + s.getAge());
					System.out.println("Student Courses : " + s.getCources());
					System.out.println();
				}
				System.out.println("-----------------------------------");
				break;
				
			case 3 : 
				System.out.println("Enter Student name to delete : ");
				String sname = sc.next();
				String deleteResponse = StudentService.deleteStudent(sname);
				System.out.println(deleteResponse);
				break;
				
			case 4 :
				System.out.println("Enter student name :");
				String uname = sc.next();
				Student responsed = StudentService.searchStudent(uname);
				if(responsed != null) {
				
				responsed.setStudentName(uname);
				System.out.println("Enter student Age :");
				int uage = sc.nextInt();
				responsed.setAge(uage);
				int option[] = new int[5];
				System.out.println("Please Enter subject choice (EX. 0(False)-1(True)) :");
				System.out.println("1. English 2. Hindi 3. Hystory 4. IT 5. Science");
				int subjectsChoice = 0;
				for(int i = 0; i < 5; i++) {
				System.out.println("Enter choice for option " + (i + 1) + " :");
				subjectChoice = sc.nextInt();
				if(subjectsChoice !=0 && subjectChoice !=1) {
					throw new RuntimeException("Please choose between 0-1");
				}
				option[i] = subjectChoice;
				}
				List<Course> selectedCource = StudentService.assignCources(option);
				responsed.setCources(selectedCource);
				}
				Student updatedStudent = StudentService.updateStudent(responsed);
				System.out.println("-----------------------------------");
				System.out.println("Student Id : " + updatedStudent.getStudentId());
				System.out.println("Student Name : " + updatedStudent.getStudentName());
				System.out.println("Student Age : " + updatedStudent.getAge());
				System.out.println("Student Courses : " + updatedStudent.getCources());
				System.out.println();
			System.out.println("-----------------------------------");
				break;
			
			case 5 : 
				System.out.println("Enter student name to search : ");
				String searchName = sc.next();
				Student searchStudent = StudentService.searchStudent(searchName);
				if(searchStudent.getStudentId() == 0) {
					System.out.println("Student not found with this name !");
					break;
				}
				System.out.println("-----------------------------------");
					System.out.println("Student Id : " + searchStudent.getStudentId());
					System.out.println("Student Name : " + searchStudent.getStudentName());
					System.out.println("Student Age : " + searchStudent.getAge());
					System.out.println("Student Courses : " + searchStudent.getCources());
					System.out.println();
				System.out.println("-----------------------------------");
				break;
			
			case 6 : 
				return;
			}
			
		}while(true);
		
	}
}
