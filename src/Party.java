
public class Party {
	private String _host;
	private String[] _guests;
	
	public Party( int maxNumber, String host) {
		_host = host;
		_guests = new String[maxNumber];
	}
	
	public void addGuest(String guest) {
		
		boolean isInList = false;
		// if() {}
		
		for(String g : _guests) {
			if( g != null && g.equals(guest) ) {
				isInList = true;
				break;
			}
		}
		
		if(isInList) {
			System.out.println( guest +  " is already on the guest list.");
		}
		else {
			for(int i = 0; i < _guests.length; ++i) {
				if(_guests[i] == null) {
					_guests[i] = guest;
				}
			}
		}
	}
	
	public void printParty() {
		System.out.println("Guestlist for David Beckham's party:");
		
		for(String g : _guests) {
			System.out.println(g);
		}
	}
}
