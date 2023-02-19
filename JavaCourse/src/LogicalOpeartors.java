import java.util.Scanner;

public class LogicalOpeartors {

	public static void main(String[] args) {
		// Logical operators = used to connect two or more expressions

		// &&=(AND) both condition must e true 
		// ||(OR) either condition must e true
		// ! =(NOT) reverses boolean value of a condition
		
//		int temp =15;
//		
//		if(temp>30) {
//			System.out.println("its is hot outside");
//		}else if(temp>=20 && temp<=30) {
//			System.out.println("it is warm outside");
//		}else {
//			System.out.println("it is cold outside");
//		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("You are playing a game ! press q or Q to quit");;
		
		String response = scanner.next();
		
		if(response.equals("q")||response.equals("Q")) {
			System.out.println("you quit the game");
		}else
		{
			System.out.println("you still palying the game");
		}
		scanner.close();
	}

}
