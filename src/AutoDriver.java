import java.util.Scanner;

public class AutoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		int carsAmount = 2;
		
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
			
		}
		
		
		sn.close();
		System.out.println("Have a nice day!");
	}

}
