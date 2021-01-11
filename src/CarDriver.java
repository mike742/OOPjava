
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		if( str1.equals(str2) ) {
			System.out.println("str1 and str2 are the same");
		}
		else {
			System.out.println("str1 and str2 are NOT the same");

		}
		
		
		
		
		
		
		Car car1 = new Car(8000.33f, "silver");
		Car car2 = new Car(777, "red");
		
		car2 = car1;
		
		car2.setColour("white");
		
		car1.display();
		car2.display();

	}

}
