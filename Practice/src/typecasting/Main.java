package typecasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implicity(Widing casting)
		int i =40;
		double d= i;
		
		System.out.println(i);
		System.out.println(d);
		
		//explicity(Narrowing type)
		double myval=34.23;
		int j= (int)myval;
		
		System.out.println(myval);
		System.out.println(j);
		
		
		String str="690";
		int k = Integer.parseInt(str);
	
		System.out.println(str);
		
	}

}
