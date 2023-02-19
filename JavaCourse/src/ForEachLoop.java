import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// for-each = traversing(guzarna) technique to iterate(tarar) through elements in an array collection
		//			  less steps, more readable
		//			  less flexible
		//			  (:) refer to in
		
//		String[] animals = {"cat","dog","rat","lion"};
		
		ArrayList<String> animals=new ArrayList<String>();
		
		animals.add("rat");
		animals.add("monkey");
		animals.add("lion");
		
		for(String i:animals) {
			System.out.println(i);
		}
		
		
		

	}

}
