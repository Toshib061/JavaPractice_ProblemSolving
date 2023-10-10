package StaticBlock;

public class StaticBlock {
	static int id;
	static String name;
	
	
	static {
		id = 100;
		name = "Abir";
	}
	
	static void display() {
		System.out.println("Name: " +name);
		System.out.println("Id: " +id);
	}

}
