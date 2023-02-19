package object_oop.polymorphism;

public class Main {

	public static void main(String[] args) {
		// polymorphism =greek word for poly "mean" many morph "Form"
		//				 the ability of an object to identify as more than one type
		
		Car car = new Car();
		
		Boat boat = new Boat();
		
		Bicycle bicycle = new Bicycle();
		
		Vechile[] racers = {car,bicycle,boat};
		
		for(Vechile x :racers) {
			x.go();
		}

	}

}
