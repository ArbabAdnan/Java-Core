package stack;

import java.util.Stack;

public class Practice {

	public static void main(String[] args) {
		// LIFO last in first out

		Stack<String> name= new Stack<>();
		name.push("adnan");
		name.push("khan");
		name.push("kasi");
		name.push("farhan");
		name.push("mirwaise");
		
		name.pop();
		name.pop();
		
		System.out.println("ForEach Loop\n");
		for(String s : name) {
			System.out.println("my name is "+s);
		}
		
		System.out.println("\nForEach Method\n");
		
		name.forEach(a->{
			System.out.println("my name is "+a);
		});
	}

}
