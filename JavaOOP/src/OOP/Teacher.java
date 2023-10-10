package OOP;

public class Teacher {
	String name, gender;
	int age;
	/*
	void SetInformation(String Name, int Age, String Gender) {
		name = Name;
		age = Age;
		gender = Gender;
	}
	*/
	Teacher(String Name,int Age,String Gender){
		name = Name;
		age = Age;
		gender = Gender;
	}
	void DisplayInformation() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("\n");
	}

}
