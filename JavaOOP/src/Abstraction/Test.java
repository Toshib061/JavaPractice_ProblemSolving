package Abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1;
		s1= new Rectangle(10,20);
		s1.area();
		
		s1 = new Triangle(10,20);
		s1.area();
		
		s1 = new Circle(10);
		s1.area();

	}

}
