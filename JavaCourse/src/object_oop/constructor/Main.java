package object_oop.constructor;

public class Main {

	public static void main(String[] args) {
		// constructor = special method that is called when object is instiantiated(created)
		// this keyword= use for particular instance

		Human humen =new Human("adnan",32,70);
		
		Human humen1 =new Human("morty",16,50);
		
		System.out.println(humen.name);
		System.out.println(humen1.name);
		
		humen1.eat();
		humen.drink();
		humen1.drink();
		
	}

}
