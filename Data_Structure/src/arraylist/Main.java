package arraylist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		DynamicArray dynamicArray = new DynamicArray(5);

//		dynamicArray.add("a");
//		dynamicArray.add("a");
//		dynamicArray.add("a");
//		dynamicArray.add("d");
//		dynamicArray.add("a");
//		
//		dynamicArray.insert(0, "X");
//		
//		dynamicArray.delete("a");
		
		dynamicArray.add("a");
		dynamicArray.add("c");
		dynamicArray.add("d");
		dynamicArray.add("e");
		dynamicArray.add("f");
		dynamicArray.add("g");
		
		dynamicArray.delete("a");
		dynamicArray.delete("c");
		dynamicArray.delete("d");
		dynamicArray.delete("e");
		dynamicArray.delete("f");
		
		
		System.out.println(dynamicArray);

		System.out.println(dynamicArray.search("d"));
	
		System.out.println("Empty "+dynamicArray.isEmpty());
		System.out.println(dynamicArray.size);
		System.out.println(dynamicArray.capacity);
	}

}
