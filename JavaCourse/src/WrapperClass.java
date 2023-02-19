
public class WrapperClass {

	public static void main(String[] args) {
		// wrapper class = provides a way to use primitives data types as reference data types
		//				   reference data types contains useful methods
		//				   can be used with collection(ex.ArrayList)
		
		//primitive		//wrapper
		//---------		--------
		//boolean		boolean
		//char			Character
		//int 			Integer
		//double		Double
		
		//autoboxing =the automatic conversion that java compiler makes between the primitive types and their corresponding object wrapper class
		//unboxing = the reverse of autoboxing.automatic conversion of wrapper class to primitive
		

		Boolean a=true;
//		Character c ='@';
//		Integer d =1;
//		Double f =3.12;
		String g ="adnan";
		
		String result=g.toUpperCase();
		System.out.println(result);
		
		if(a==false) {
			System.out.println("this is wrapper class");
		}
		else {
			System.out.println("hello");
		}
		
	}

}
