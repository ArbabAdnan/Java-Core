package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// Stack = LIFO Data Structure LAST-IN FIRST-OUT
		//		   STORE ObJECT INTO A SORT OF VERTICAL TOWER 
		//		   PUSH() TO ADD THE TOP
		// 		   POP() TO ADD THE TOP

		Stack<String> stack = new Stack<String>();
		
		stack.push("a");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
		
		
//		System.out.println(stack.empty());
//		System.out.println(stack.search("a"));
		System.out.println(stack);
		stack.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("+++++++++++++++++++++++");
		
		for(String s:stack) {
			System.out.println(s);
		}
	
		
	}

}
