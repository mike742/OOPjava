
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 10;
		int b = 10;

		if(a == b) {
			System.out.println("a and b are the same");
		}
		else {
			System.out.println("a and b are NOT the same");

		}		
		
		String str1 = new String("string number 1");
		String str2 = new String("string number 1");
		// str1 == str2
		if(str1.equals(str2) ) {
			System.out.println("str1 and str2 are the same");
		}
		else {
			System.out.println("str1 and str2 are NOT the same");

		}
		*/
		
		
		
		Car car1 = new Car(777, "red");
		Car car2 = new Car(777, "red");
		
		if(car1.equals(car2) ) {
			System.out.println("Cars are equal");
		}
		else {
			System.out.println("Cars are NOT equal");

		}
		
		car2.setColour("white");
		
		//Car car3 = car2.clone(); // new Car(_cost, _colour)
		Car car3 = new Car(car2.getCost(), car2.getColour());
		
		car1.display();
		car2.display();
		car3.display();
	}

}
