package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// QUEUE = FIFO DATA STRUCTURE FIRS-IN FIRST-OUT (EX. LINE OF PEOPLE)
		//		   A COLLECTION DESIGNED FOR HOLDING ELEMENTS PRIOR TO PROCESSING 
		//		   LINEAR DATA STRUCTURE

		//		   add =  enqueue offer();
		//		   remove = dequeue poll();
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("a");
		queue.offer("c");
		queue.offer("d");	
		queue.offer("e");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.element());
		System.out.println(queue.size());
		System.out.println(queue.contains("c"));
		
		System.out.println(queue.peek());
		
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
		
		
		System.out.println(queue);
		
	}

}
