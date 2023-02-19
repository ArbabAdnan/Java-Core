
public class Method {

	public static void main(String[] args) {
		// method = a block of code that is executed when ever is called upon

//		String name="adnan";
//		String a = name.toUpperCase();
//		
//		int age = 21;
//		
//		hello(a,age);
		
		int x=3;
		int y=4;
		add(x,y);
		int z =add(x,y);
		System.out.println(z);
	}

//	static void hello(String a ,int age) {
//		System.out.println("Hello " + a);
//		System.out.println("Hello " + age);
//	}
	
	static int add(int x ,int y) {
		int z=x+y;
		return z;
		
	}
}
