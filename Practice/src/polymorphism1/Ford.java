package polymorphism1;

public class Ford {

	private String model;
	private String make;
	private int year;
	
	
	public Ford(String model, String make, int year) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
	}
	 void go() {
		 System.out.println("Ford is moving");
		 
	 }
	 void stop() {
		 System.out.println("Ford is stop");
	 }
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
