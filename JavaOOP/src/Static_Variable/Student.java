package Static_Variable;

public class Student {
	static int count;
	
	Student(){
		count++;
	}
	
	void TotalStudent() {
		System.out.println("Total: " + count);
	}

}
