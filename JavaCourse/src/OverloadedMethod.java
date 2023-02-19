
public class OverloadedMethod {

	public static void main(String[] args) {
		// overloaded method = methods that share same name but different parameters
		//					   method name + parameters = method signature

		double x = add(1,2,3,4);
		System.out.println(x);
	}
	
	static int add(int a, int c) {
		System.out.println("this is overloaded method #1");
		return a + c;
	}

	static int add(int a, int c, int d) {
		System.out.println("this is overloaded method #2");
		return a + c +d;
	}static int add(int a, int c, int d, int e) {
		System.out.println("this is overloaded method #3");
		return a + c+ d +e;
	}
	
	static double add(double a, double c) {
		System.out.println("this is overloaded method #1");
		return a + c;
	}

	static double add(double a, double c, double d) {
		System.out.println("this is overloaded method #2");
		return a + c +d;
	}static double add(double a, double c, double d, double e) {
		System.out.println("this is overloaded method #3");
		return a + c+ d +e;
	}
}
