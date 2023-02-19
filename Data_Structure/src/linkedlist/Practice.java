package linkedlist;

import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkedList = new LinkedList<>();
		
		
		 //LinkedList Stack
		linkedList.push("Adnan");
		linkedList.push("Ali");
		linkedList.push("Farhan");
		linkedList.push("Asad");
		linkedList.push("Fazal");
		linkedList.push("Kamran");
		
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList);
		
		
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
		
		for(String s : linkedList) {
			System.out.println(s);
		}
	}

}
