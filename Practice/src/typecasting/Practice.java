package typecasting;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("++++++++++++Implicitly+++++++++++++ ");
		int i= 10;
		double j =i;
		
		System.out.println(j);
		
		System.out.println("++++++++++++Explicitly+++++++++++++ ");
		
		double k=40.59;
		int x= (int)k;
		System.out.println(x);
		
		System.out.println("+++++++++String into Integer++++++++++++++++ ");
		
		String str="123";
		int y=Integer.parseInt(str);
		System.out.println(y);
		
	}

}
