package alfidoprojecttask1;

class Calculator{
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b){
		return a + b;
	}
	
	float add(float a, float b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class PolymorphismExm1 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Addition Using Overloading Concept :");
		System.out.println("1. 12 + 13 = " + c.add(12, 13));
		System.out.println("2. 22.14 + 13.15 = " + c.add(22.14, 13.15));
		System.out.println("3. 100.3256 + 10.2589 = " + c.add(100.3256, 10.2589));
		System.out.println("3. 12 + 13 + 15 = " + c.add(12, 13, 15));
	}
}
