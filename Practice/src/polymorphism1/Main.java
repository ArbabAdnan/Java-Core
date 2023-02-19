package polymorphism1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//
//		Car car = new Car();
//		
//		Truck truck = new Truck();
//		
//		Cycle cycle = new Cycle();
//		
//		Vechile[] racer= {car,cycle,truck};
//		
//		for(Vechile x : racer) {
//			x.go();
//		}
		
		Cycle cycle = new Cycle();
		Ford ford = new Ford("mustang", "ford", 2020);
;
		
		System.out.println(ford.getMake());
		System.out.println(ford.getModel());
		System.out.println(ford.getYear());
		System.out.println("++++++++++++++++");
		ford.go();
		ford.stop();
		
		System.out.println("///////////////////////");
		Scanner scanner = new Scanner(System.in);
		
		Vechile vechile;
		
		
		
		
		System.out.println("Enter The vechile");
		System.out.println("1 : (Car) 2: (Cycle) 3: (Truck) ");
		
		int choice = scanner.nextInt();
		
		if(choice==1) {
			vechile = new Car();
			vechile.go();		
		}
		else if(choice==2){

			
			cycle.damage();
		}
		else if(choice==3) {
			vechile = new Truck();
			vechile.stop();
			vechile.go();
			
		}else
		{
			vechile = new Vechile();
			System.out.println("That choice are in valid");
			vechile.go();
			
		}
	}
	

}
