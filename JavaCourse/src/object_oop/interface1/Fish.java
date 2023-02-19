package object_oop.interface1;

public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("this fish is hunting smaller fish");
	}

	@Override
	public void flee() {
		// TODO Auto-generated method stub
		System.out.println("this is fish fleeing for larger fish");
	}

}
