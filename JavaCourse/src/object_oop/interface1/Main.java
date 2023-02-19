package object_oop.interface1;

public class Main {

	public static void main(String[] args) {
		//interface = a template  that can be applied to a class.
		//			  similar to inheritance but specifies what a class has/must do
		//			  classes can apply more than one interface, inheritance is limited to one super
	
	
//			Rabbit rabbit = new Rabbit();
//			
//			Hawk hawk = new Hawk();
//			
//			hawk.hunt();
//			
//			rabbit.flee();
		Fish fish = new Fish();
		
		fish.flee();
		fish.hunt();
		
		
	}

}
