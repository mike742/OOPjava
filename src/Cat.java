
public class Cat {

	String name;
	int age;
	String color;
	String breed;
	
	public void sleep() {
		System.out.println(this.name + " is sleeping");
	}

	public void play() {
		System.out.println(this.name + " is playing");
	}
	
	public void feed() {
		System.out.println(this.name + "is eating");
	}
	
	public static void classInfo() {
		System.out.println( "this is a Cat instance");
	}
}
