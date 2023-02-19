package linkedlist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// LinkedList = stores Nodes in 2 parts(data + address)
		//				Nodes are in non-consecutive memory locations
		//				elements are linked using pointer
		//				
		
		//									/Singly Linked List
		
		//				Nodes				Node				Node
		//			[data | address]->	[data | address]->	[data | address]
		
		//											Doubly Linked List
		
		//						Nodes							Node						   Node
		//			[address | data | address]->	[address | data | address]->	[address | data | address]

		
		//			advantages?
		//			1. Dynamic Data Structure (allocation needed memory while running)
		//			2. No random access of element (no index[i])
		//			3. Accessing/searching element is more time consuming. O(n)
		
		//			uses
		//			1. implement Stack/Queues
		//			2. GPS navigation
		//			3. music play list
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		
//		//LinkedList Stack
//		linkedList.push("A");
//		linkedList.push("C");
//		linkedList.push("D");
//		linkedList.push("E");
//		linkedList.push("F");
//		linkedList.push("G");
//		
//		linkedList.pop();
//		
//		System.out.println(linkedList);
		
//		//LinkedList Queue
		linkedList.offer("A");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("E");
		linkedList.offer("F");
		linkedList.offer("G");
		
//		linkedList.poll();
		
		linkedList.add(4,"Z");
		linkedList.remove("Z");
		
//		System.out.println(linkedList.indexOf("A"));
		
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		
//		String first = linkedList.removeFirst();
//		String last = linkedList.removeLast();
		
		
		System.out.println(linkedList);
		
	}

}
