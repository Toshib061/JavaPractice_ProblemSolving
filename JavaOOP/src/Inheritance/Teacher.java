package Inheritance;

public class Teacher extends person {
	String qualification;
	
	void DisplayInformation2() {
		DisplayInformation1();
		System.out.println("qualification: "+qualification);
	}

}
