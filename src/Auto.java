
public class Auto {

	private String make;
	private String color;
	
	public void setMake(String value) {
		make = value;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setColor(String value) {
		color = value;
	}
	
	public Auto printMake() {
		System.out.print(make);
		return this;
	}
	
	public Auto printColor() {
		System.out.print(color);
		return this;
	}
}
