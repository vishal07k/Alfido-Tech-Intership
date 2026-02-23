package alfidoprojecttask1;

class Animal{
	void makeSound() {	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("Barking..............!");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("Meaooooooooooooooo");
	}
}

public class PolymorphismExm2 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.makeSound();
	}
}
