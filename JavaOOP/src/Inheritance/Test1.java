package Inheritance;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		System.out.println(a1 instanceof Animal);
		System.out.println(c1 instanceof Animal);
		System.out.println(d1 instanceof Animal);
		System.out.println(d1 instanceof Cat);
		System.out.println(c1 instanceof Dog);
		System.out.println(a1 instanceof Cat);
		System.out.println(a1 instanceof Dog);

	}

}
