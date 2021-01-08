
public class CatDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cat c1 = new Cat();
		
		c1.name = "Snowball";
		c1.age = 5;
		c1.color = "black";
		c1.breed = "Stray";
		
		Cat c2 = new Cat();
		
		c2.name = "Snowball 2";
		c2.age = 3;
		c2.color = "White";
		c2.breed = "Stray";
		
		c2.sleep();
		c2.play();
		// c2.classInfo();
		
		
		Cat.classInfo();
	}

}
