package alfidoprojecttask1;

import java.util.Scanner;

class Student{
	private int rollNo;
	private String name;
	private int marks[] = new int[5];
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String name, int[] marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String calGrade(int arr[]) {
		int totalMarks = 0;
		for(int i=0; i < arr.length; i++) {
			totalMarks += arr[i];
		}
		if(totalMarks >= 90) {
			return "Grade A+";
		}else if(totalMarks >= 80){
			return "Grade A";
		}else if(totalMarks >= 70) {
			return "Grade B";
		}else {
			return "Grade C";
		}
	}
}
public class EncapsulationExample {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Students Details :");
	String name = sc.next();
	
	}
}
