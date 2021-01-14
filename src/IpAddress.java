
public class IpAddress {
	private String dottedDecimal;
	private int firstOctet, secondOctet, thirdOctet, fourthOctet;
	
	public IpAddress(String value) {
		dottedDecimal = value;
		// 216.27.6.136
		String[] res = dottedDecimal.split("[.]");
		
		// System.out.println(res.length); // 216
		firstOctet = Integer.parseInt(res[0]); 
		secondOctet = Integer.parseInt(res[1]);
		thirdOctet = Integer.parseInt(res[2]);
		fourthOctet = Integer.parseInt(res[3]);
		
		System.out.println(firstOctet + " " + secondOctet + " " + thirdOctet + " " + fourthOctet);
	}
}
