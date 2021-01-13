public class Car {

	private String _colour;
	private float _price; 
	private float _cost;

	public Car() {
	}

	public Car(float cost, String colour) {
		_colour = colour;
		_cost = cost;
		_price = 2 * cost;
	}

	public void setColour(String value) {
		_colour = value;
	}

	public String getColour() {
		return _colour;
	}

	public float getPrice() {
		return _price;
	}

	public void setCost(float cost) {
		_cost = cost;
		_price = 2 * cost;
	}
	
	public float getCost() {
		return _cost;
	}
	
	public boolean equals(Car car) {
		return (this._colour.equals(car._colour) && this._cost == car._cost);
	}
	
	public Car clone() {
		/*
		Car res = new Car(_cost, _colour);
		
		res._colour = _colour;
		res._cost = _cost;
		res._price = 2 * _cost;
		
		return res;
		*/
		return ( new Car(_cost, _colour) );
	}
	
	public void swap(Car car) {
		// car1.swap(car2);
		// this => car1   car => car2
		
		Car temp = new Car(car._cost, car._colour);
		
		car._colour = this._colour;
		car._cost = this._cost;
		car._price = this._cost * 2;
		
		this._colour = temp._colour;
		this._cost = temp._cost;
		this._price = this._cost * 2;
	}
	
	public void display() {
		System.out.println("Price = " + _price + ", Colour = " + _colour);
	}
}