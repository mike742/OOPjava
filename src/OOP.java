
public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 63;
		double d2 = 65;
		
		double p1 = Math.pow(10, d1 / 10);
		double p2 = Math.pow(10, d2 / 10);
		
		double res = 10 * Math.log10(p1 + p2);
		
		System.out.println("res = " + res);
		
		/*
		
		Enter a variable name (q to quit): street address2
		Illegal.
		
		Enter a variable name (q to quit): 2ndStreetAddress
		Illegal.
		
		Enter a variable name (q to quit): StreetAddress2
		Legal, but uses poor style.
		
		Enter a variable name (q to quit): street$address$2
		Legal, but uses poor style.
		
		Enter a variable name (q to quit): streetAddress2
		Good!*/
		/*
		System.out.println( varNameChecker("2ndStreetAddress") );
		System.out.println( varNameChecker("street address2") );
		
		System.out.println( varNameChecker("StreetAddress2") );
		System.out.println( varNameChecker("street$address$2") );
		
		System.out.println( varNameChecker("streetAddress2") );
		
		int res2 = varNameChecker("streetAddress2"); // 3, 2, 1
		
		switch(res2) {
		case 1: 
			// Illegal
			break;
		case 2: 
			// poor styled
			break;
		case 3: 
			// Good
			break;
		}
		*/
		
		// phone("1-816-7412000");
		// phone("86-131-12345678");
		
		String pn = "1-816-7412000";
		String[] parts = pn.split("-");
		
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(parts[2]);
	}
	
	
	public static void phone(String input) {
		String cc = "", ac = "", pn = "";
		int dashCount = 0;
		
		for(int i = 0; i < input.length(); ++i) {
			char c = input.charAt(i);
			
			if(c == '-') {
				dashCount++;
			}
			else {
				switch(dashCount) {
				case 0: 
					cc += c;
					break;
				case 1: 
					ac += c;
					break;
				case 2: 
					pn += c;
					break;
				}
			}
		}
		
		System.out.println("cc: " + cc);
		System.out.println("ac: " + ac);
		System.out.println("pn: " + pn);
	}
	
	// public static void 
	public static int varNameChecker(String input) {

		int res = 3;
		
		for(int i = 0; i < input.length() && res != 1; ++i) {
			
			char c = input.charAt(i);
			
			if( (Character.isDigit(c) && i == 0) ||
				!( Character.isLetterOrDigit(c) || c == '$' )) {
				res = 1;
			}
			
			if( (Character.isLetter(c) && Character.isUpperCase(c) && i == 0) ||
				c == '$') {
				res = 2;
			}
		}
		
		return res;
	}

}
