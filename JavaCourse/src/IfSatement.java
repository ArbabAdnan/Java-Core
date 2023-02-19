
public class IfSatement {

	public static void main(String[] args) {
		// if statement = perform a block of code if its condition evaluates to e true ev
		
		int age = 75;
		
		if(age==75) {
			System.out.println("ok you are 75 !");
			
		}
		else if(age>=18) {
			System.out.println("okay you are adult");
		}
		else if(age>=13) {
			System.out.println("you are a teenager");
		}
		else
		{
			System.out.println("you are not adult");
		}

	}

}
