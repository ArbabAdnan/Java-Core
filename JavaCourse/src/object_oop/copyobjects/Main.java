package object_oop.copyobjects;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car = new Car("mustang", "ford", 2022);
//		Car car1 = new Car("tesla", "new", 2022);
//		
//		car1.copy(car);
		Car car1 = new Car(car);
		
		System.out.println(car);
		System.out.println(car1);
		System.out.println();
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		System.out.println();
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		
		
	}
	

}
