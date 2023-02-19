package object_oop.dynamicpolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// polymorphism = many shapes/forms
		//dynamic = after compilation (during runtime)
		
		//ex, a corvette is a : corvette and a car, and a vechile and an object

		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("which animal do you want ");
		System.out.println("1: (cat) 2: (dog)");
		
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal= new Dog();
			animal.speak();
		}else if(choice==2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal= new Animal();
			System.out.println("that choice was in valid");
			animal.speak();
		}
	}

}
