package inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("chioce the Animal");
		System.out.println("1 (Dog) 2 (Lions)");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal =new Dog();
			animal.speak();
		}
		else if(choice==2) {
			animal =new Lion();
			animal.speak();
		}
		else {
			animal= new Animal();
			System.out.println("That chioce are invalid");
			animal.speak();
			
			scanner.close();
		}
		 
	}

}
