package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// exception = an event that  occure during excecution of a program that
		//			    distrupts the normal flow of ins truction
		
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the whole num to divide");
			int x = scanner.nextInt();
			
			System.out.println("Enter the whole num to divide y");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("Result "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("You cant divide yy zero");
		}
//		catch (Exception e) {
//		System.out.println("miss match");
//		}
		catch (InputMismatchException e) {
			System.out.println("please enter  a num");

	}}

}
