package polymorphism;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		Truck truck = new Truck();
		
		Cart cart = new Cart();
		
		Vechile[] racer = {car,truck,cart};
		
		for(Vechile x:racer) {
			x.go();
		}
	}

}
