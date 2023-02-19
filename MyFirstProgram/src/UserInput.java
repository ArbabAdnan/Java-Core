import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("What is ur name ");
		String name = s.nextLine();
		
		System.out.println("How old are you");
		int age = s.nextInt();
		s.nextLine();
		
		System.out.println("what is  food do you like ");
		String f = s.nextLine();
		
		System.out.println("Hello "+name);
		
		System.out.println("You are "+ age+" year old ");
		
		System.out.println("you like "+ f);
		
		s.close();
	}

}
