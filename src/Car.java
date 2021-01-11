public class Car {

	private String colour;
	private float price; 
	private float cost;

	public Car() {
	}

	public Car(float cost, String colour) {
		this.colour = colour;
		this.cost = cost;
		this.price = 2 * cost;
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

	public void setCost(float cost) {
		this.cost = cost;
		this.price = 2 * cost;
	}

	public void display() {
		System.out.println("Price = " + this.price + ", Colour = " + this.colour);
	}
}