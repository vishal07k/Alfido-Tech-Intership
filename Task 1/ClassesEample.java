package alfidoprojecttask1;

class Car{
	int year;
	String brand, model;
	double price;
	
	public Car(String brand,String model, int year, double price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Car Details \n Car Brand:\t" + brand + "\n Car model:\t" + model + "\n Car year:\t" + year + "\n Car price:\t" + price + "\n");
	}
}


public class ClassesEample {

	public static void main(String args[]) {
		Car op1 = new Car("BMW", "CR7", 2026, 25666666.00);
		Car op2 = new Car("Mercedise", "Benze", 2025, 2500000.00);
		
		op1.displayDetails();
		op2.displayDetails();
	}
}
