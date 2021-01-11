public class Car {

	private String colour;
	private float price;

	public Car() {
	}

	public Car(float price, String colour) {
		this.colour = colour;
		this.price = price * 2;
	}

	public void setColour(String value) {
		this.colour = value;
	}

	public String getColour() {
		return this.colour;
	}

	public float getPrice(float price) {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price * 2;
	}

	public void display() {
		System.out.println("Price = " + this.price + ", Colour = " + this.colour);
	}
}