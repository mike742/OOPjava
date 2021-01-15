
public class Person {
	
	private String _firstName;
	private String _lastName;
	
	private static int _numOfPeople = 0;
	
	public Person() {
		_firstName = "John";
		_lastName = "Doe";
		_numOfPeople++;
	}
	
	public Person(String fn, String ln) {
		_firstName = fn;
		_lastName = ln;
		_numOfPeople++;
	}
	
	public void setFirst(String value) {
		_firstName = value;
	}
	
	public void setLast(String value) {
		_lastName = value;
	}

	public void printFullName() {
		System.out.println(_firstName + " " + _lastName);
	}
	
	public static int getNumOfPeople() {
		return _numOfPeople;
	}
}
