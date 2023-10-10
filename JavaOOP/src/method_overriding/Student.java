package method_overriding;

public class Student extends person {
	String qualification;
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Qualification: "+qualification);
	}

}
