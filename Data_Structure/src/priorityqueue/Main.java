package priorityqueue;



import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//priority queue = a FIFO data structure that serves elements 
		//				   with the highest priorities first
		// 				   before elements with lower priority				
		
		//Queue<Double> queue = new LinkedList<>();
		
		
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
		
//		queue.offer(3.0);
//		queue.offer(2.5);
//		queue.offer(4.0);
//		queue.offer(1.5);
//		queue.offer(2.0);
		
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");
		queue.offer("E");
		
		
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
