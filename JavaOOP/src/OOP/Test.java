package OOP;

public class Test {

	public static void main(String[] args) {
		Teacher teacher1; // object declaration
		teacher1 = new Teacher("Amin Ahmed",25,"Male"); // object creation
		
		Teacher teacher2 = new Teacher("abc",26,"Female"); // object creation in one line
	    /*	
		teacher1.name = "Amin Ahmed";
		teacher1.age = 25;
		teacher1.gender = "Male";
		*/
	  //teacher1.SetInformation("Amin Ahmed",25,"Male");
		teacher1.DisplayInformation();
		
		/*
		teacher2.name = "abc";
		teacher2.age = 26;
		teacher2.gender = "Female";
		*/
		teacher2.DisplayInformation();
		
		
		

	}

}
