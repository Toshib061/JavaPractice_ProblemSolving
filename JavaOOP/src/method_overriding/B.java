package method_overriding;

public class B extends A{
	int x = 5;
	
	
	void display() {
		System.out.println(super.x);
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("Print class B");
	}

}
