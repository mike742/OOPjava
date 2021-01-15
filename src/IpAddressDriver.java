import java.util.Arrays;
import java.util.Scanner;

public class IpAddressDriver {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		String ip = " ";
		
		System.out.println("Enter your IP address: ");
		ip = sn.next();
		
		if(IpAddress.isValid(ip)) {
			IpAddress address = new IpAddress(ip);
			
		}
		else {
			System.out.println(" Invalid input!!!!!");
		}
		
		/*
		boolean isValid;

		do {
			System.out.println("Enter your IP address: ");
			num = sn.next();
			if (num.contains(".")) {

				IpAddress ip = new IpAddress(num);
				isValid = true;
			} else {
				System.out.println("Please enter validnumber");
				isValid = false;
				sn.next();
			}

		} while (!(isValid));
		 */
		
		System.out.println("Have a nice day!");
		sn.close();

	}

}
