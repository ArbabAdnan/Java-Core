
public class Array2D {
	public static void main(String[] args) {
	
		//two dimensional array
		//2D array = an array of array
		
		String[][] cars = new String[3][3];
		
		cars[0][0]="Tendra";
		cars[0][1]="Tesla";
		cars[0][2]="Toyota";
		cars[1][0]="Ford";
		cars[1][1]="mustang";
		cars[1][2]="suzuki";
		cars[2][0]="farrari";
		cars[2][1]="sonita";
		cars[2][2]="vigo";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.println(cars[i][j]);
				
			}
		}
		
		
		
	}
}
