package alfidoprojecttask1;

class Person {
	protected int age;
	protected String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void displyeInfo() {
		System.out.print("Name : " + this.name + "\nAge : " + this.age);
	}
}

class Employee extends Person {
	int empId;
	double salary;

	public Employee(int age, String name, int empId, double salary) {
		super(age, name);
		this.empId = empId;
		this.salary = salary;
	}

	public void displayEmpInfo() {
		super.displyeInfo();
		System.out.print("\n Employee ID : " + this.empId + "\nSalary : " + this.salary);
	}
}

public class EmployeeInheritance {

	public static void main(String[] args) {

		Employee e1 = new Employee(29, "Montu Singh", 1250, 250000.00);
		Employee e2 = new Employee(39, "Vishu Deva", 120, 850000.00);
		Employee e3 = new Employee(29, "Shawn Bengali", 1259, 550000.00);

		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
	}
}
