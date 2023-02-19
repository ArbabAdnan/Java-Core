package object_oop.encapsulation;

public class Mian {

	public static void main(String[] args) {
		// Encapsulation = attributes of class will be hidden or private,
		//					can be accessed only through methods (getter & setter)
		//					you should make attributes private if you dont't have reason to make them public

		Car car = new Car("mustung","ford",2021);
		
	
		car.setYear(2020);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		System.out.println("+++++++++++++++++++++++");
		Car car1 = new Car("mustung","ford","red");
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());

	}
}
