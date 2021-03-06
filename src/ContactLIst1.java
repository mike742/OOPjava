import java.util.Scanner;

public class ContactLIst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		long[] phoneList;
		int sizeOfList;
		long phoneNumber;
		
		System.out.println("How many? ");
		sizeOfList = sn.nextInt();
		phoneList = new long[sizeOfList];
		
		for(int i = 0; i < sizeOfList; ++i) {
			System.out.print("Enter phone number: ");
			phoneNumber = sn.nextLong();
			phoneList[i] = phoneNumber;
		}
		
		System.out.print("\n\n Contacts List: \n");
		
		for(int i = 0; i < sizeOfList; ++i) {
			System.out.println((i + 1) + ": " + phoneList[i]);
		}
		
		
		sn.close();
		
		System.out.println(reverseInt(123456789));
		
		// method(int): int => 123 321, 456 654, 123456789 98765431
		// no String type!!!
	}
	
	public static int reverseInt(int value) {
		int res = 0;
		
		while(value > 0) {
			
			res = 10 * res + value % 10;
			value /= 10;
		}
		
		return res;
	}

}
