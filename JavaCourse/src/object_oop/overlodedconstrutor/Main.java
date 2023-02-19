package object_oop.overlodedconstrutor;

public class Main {

	public static void main(String[] args) {
		// overloaded constructors = multiple constructors with in as class with the samee name
		// 							but have different parameters
		//							name + parameters = signature

		Pizza pizza = new Pizza("thick creast","bbq","mozzerilla","garlic");
		
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		
		
	}

}
