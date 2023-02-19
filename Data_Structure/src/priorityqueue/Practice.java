package priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		
		queue.offer("adnan");
		queue.offer("khan");
		queue.offer("kasi");
		queue.offer("Farhan");
		queue.offer("mirwaise");
		queue.offer("zakir");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
