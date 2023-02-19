package object_oop.tostring;

public class Car {

	String make= "ford";
	String model ="Ford";
	String color ="red";
	int 	year = 2020;
	
	public String toString() {
		return make+"\n"+model+"\n"+color+"\n"+year;
	}
}
