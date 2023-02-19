package twodimensionalarraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		ArrayList<String> cakeList = new ArrayList<String>();
		cakeList.add("velvet");
		cakeList.add("choclate");
		cakeList.add("vanilla");
		
		ArrayList<String> productList = new ArrayList<String>();
		cakeList.add("vegetl");
		cakeList.add("meat");
		cakeList.add("icecream");
		
		ArrayList<String> DrinkList = new ArrayList<String>();
		cakeList.add("soda");
		cakeList.add("watter");
		cakeList.add("softdrink");
		
		groceryList.add(cakeList);
		groceryList.add(productList);
		groceryList.add(DrinkList);
		System.out.println(groceryList.add(cakeList));
		
	}

}
