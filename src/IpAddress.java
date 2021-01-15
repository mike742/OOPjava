
public class IpAddress {
	private String dottedDecimal;
	private int firstOctet, secondOctet, thirdOctet, fourthOctet;
	
	public IpAddress(String value) {
		dottedDecimal = value;
		// 216.27.6.136 => 3'.' (0 - 255)
		String[] res = dottedDecimal.split("[.]");
		
		firstOctet = Integer.parseInt(res[0]); // (0 - 255)
		secondOctet = Integer.parseInt(res[1]);
		thirdOctet = Integer.parseInt(res[2]);
		fourthOctet = Integer.parseInt(res[3]);
		
		System.out.println(firstOctet + " " + secondOctet + " " + thirdOctet + " " + fourthOctet);
	}
	
	public static boolean isValid(String value) {
		boolean res = true;
		int numOfDots = 0;
		
		// 1
		for(int i = 0; i < value.length(); ++i) {
			if(value.charAt(i) == '.') {
				numOfDots++;
			}
		}
		System.out.println("numOfDots = " + numOfDots);
		if(numOfDots != 3) {
			return false;
		}
		
		// 2 
		for(int i = 0; i < value.length(); ++i) {
			char c = value.charAt(i);
			
			if(!(c == '.' || Character.isDigit(c))) {
				return false;
			}
		}	
		
		return res;
	}
}
