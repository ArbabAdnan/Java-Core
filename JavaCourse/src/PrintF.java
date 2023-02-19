
public class PrintF {

	public static void main(String[] args) {
		// printf() = an optional method to control, format, and display text to the console window
		//			  two arguments = formet string +(object/variable/value)
		//			  %[flags][precision] [width] [conversion-character]
		
		char myChar ='@';
		String myString = "adnan";
		int myInt =50;
		double myDoule=1000;
		
		//Conversion-character
//		System.out.printf("%c " ,myChar);
//		System.out.printf("%s ",myString);
//		System.out.printf("%d ",myInt);
//		System.out.printf("%f ",myDoule);
//		
		
		//[width]
		//minimum num of characters to written as output 
//		System.out.printf("Hello %10s",myString);
		
//		[precision]
//		sets num of digits of precision when outputting floating-point values
//		System.out.printf("you have this much money %.2f",myDoule);
		
//		[flags]
//		adds an effects to output on the flag added to format specifier
//		- : left-justify
// 		+ : output a plus(+) or minus (-) sign for a numeric value
//		0 : numeric values are zero-padded
//		, : comma grouping separator if num >1000
		
		System.out.printf("you have this much money %,f",myDoule);
	}

}
