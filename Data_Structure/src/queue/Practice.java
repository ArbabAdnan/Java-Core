package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice {

	public static void main(String[] args) {
		// FIFO first in first out
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("adnan");
		queue.offer("khan");
		queue.offer("kasi");
		queue.offer("zakir");
		queue.offer("farhan");
		
		queue.poll();
		System.out.println(queue.isEmpty()+"\n");
		System.out.println(queue.add("mirwaise"));
		
		for(String s: queue) {
			System.out.println(s);
		}
		
		queue.forEach(e->{
			System.out.println("\n my name is "+e);
		});

	}

}
