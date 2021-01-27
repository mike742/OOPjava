import java.util.Scanner;

public class VolewCounterDriver {

	public static void main(String[] args) {
		VolewCounter vc = new VolewCounter();
		Scanner scan = new Scanner(System.in);
		String input = "123456";
		boolean check = true;

		do {

			System.out.println("Enter a line of characters (press enter by itself to quit): ");

			input = scan.nextLine();
			
			/*
			if ( input.equals("") ) { // input == ""
				break;
			}
			*/
			vc.processLine(input);
		}
		while ( !input.equals("") );
		
		vc.printSummary();

		scan.close();
	}

}
