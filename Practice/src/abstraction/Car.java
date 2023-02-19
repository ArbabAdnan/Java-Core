package abstraction;

public class Car extends Vechile {

	@Override
	void go() {
		System.out.println("Car is moving");
		
	}

	@Override
	void stop() {
		System.out.println("Car is stop");
		
	}

}
