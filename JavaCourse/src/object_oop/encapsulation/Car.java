package object_oop.encapsulation;

public class Car {

	private String make;
	private String model;
	private int year;
	private String color;
	
	Car(String make, String model, int year){
		
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Car(String make, String model, String color){
		
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		
	}
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	
	

}
