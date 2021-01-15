
public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Person person1 = new Person(); // _numOfPeople == 1 
		 person1.printFullName();

		 Person person2 = new Person("Matt", "Thebo"); // _numOfPeople == 2 
		 person2.printFullName();

		 person1.setFirst("Paul");
		 person1.setLast("John");
		 person1.printFullName();
		 
		 Person person3 = new Person();
		 Person person4 = new Person();
		 Person person5 = new Person();
		 Person person6 = new Person();
		 Person person7 = new Person();

		 
		 System.out.println("Total number of people = " + Person.getNumOfPeople());
		
	}

}
