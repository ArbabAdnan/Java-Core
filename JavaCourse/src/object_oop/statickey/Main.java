package object_oop.statickey;

public class Main {

	public static void main(String[] args) {
		// Super = keyword refers to the superclass (parent )
//					very similar to the "this" keyword
	
	
		Hero hero = new Hero("spidermen",42,"rich");
		
//		System.out.println(hero.age);
//		System.out.println(hero.name);
//		System.out.println(hero.power);

		System.out.println(hero.toString());
	
	}

}
