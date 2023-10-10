package Static_keyword;

public class Student {
	String name;
	int id;
	static String UniversityName= "LU";
	
	
	Student(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	void displayInformation() {
		System.out.println("Name: " +name);
		System.out.println("Id: " +id);
		System.out.println("University Name: " +UniversityName);
	}

}
