import java.util.*;
public class TwoDimensionalArrayList {

	public static void main(String[] args) {
		// 2D ArrayList= a dynamic list of lists
		// you can change the size of these lists during runtime

		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> cakeList = new ArrayList<String>();
		cakeList.add("pasta");
		cakeList.add("garlic");
		cakeList.add("doo");
		
		ArrayList<String> ProductList = new ArrayList<String>();
		
		ProductList.add("tamotos");
		ProductList.add("vegetale");
		ProductList.add("medical");
		
		ArrayList<String> DrinkList = new ArrayList<String>();
		
			DrinkList.add("jucies");
			DrinkList.add("cold drink");
			DrinkList.add("water");
			
			groceryList.add(cakeList);
			groceryList.add(ProductList);
			groceryList.add(DrinkList);
			System.out.println(groceryList.get(2).get(2));
		
		
	}

}
