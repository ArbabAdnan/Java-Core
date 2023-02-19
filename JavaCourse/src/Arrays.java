
public class Arrays {

	public static void main(String[] args) {
		// arrays= used to store multiple values in a single variable
		
//		String[] car= {"Camero","tesla","bmw","honda"};
//		
//		car[0]="mustung";
//		
//		System.out.println(car[1]);
//		
		String[] cars= new String[3];
		
		cars[0]="camero";
		cars[1]="tesla";
		cars[2]="tesla 2";
		
		
		for(int i =0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		

	}

}
