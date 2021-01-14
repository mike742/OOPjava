import java.util.Scanner;

public class AutoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Amount of cars: ");
		int carsAmount =  Integer.parseInt( sn.nextLine() );
		
		for(int i = 0; i < carsAmount; ++i) {
			
			char makeChar = ' ', colorChar = ' ';
			String makeStr = "", colorStr = "";
			Auto car = new Auto();
			
			while(true) {
				System.out.println("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
				makeChar = sn.nextLine().charAt(0);
				
				if(makeChar == 'b' || makeChar == 'c' || makeChar == 'p') {
					break;
				}
				else {
					System.out.println("The only valid selections are 'b', 'c', or 'p': ");
				}
			}
			
			while(true) {
				System.out.println("Select blue, green, or red (b,g,r): ");
				colorChar = sn.nextLine().charAt(0);
				
				if(colorChar == 'b' || colorChar == 'g' || colorChar == 'r') {
					break;
				}
				else {
					System.out.println("The only valid selections are 'b', 'g', or 'r': ");
				}
			}
			
			switch(makeChar) {
			case 'b':
				makeStr = "Buick";
				break;
			case 'c':
				makeStr = "Chevrolet";
				break;
			case 'p':
				makeStr = "Pontiac";
				break;
			}
			
			switch(colorChar) {
			case 'b':
				colorStr = "Blue";
				break;
			case 'g':
				colorStr = "Green";
				break;
			case 'r':
				colorStr = "Red";
				break;
			}
			
			//System.out.println(colorStr + " " + makeStr);
			
			car.setMake(makeStr);
			car.setColor(colorStr);
			
			car.printColor().printMake();
		}
		
		
		sn.close();
		System.out.println("Have a nice day!");
	}

}
