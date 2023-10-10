package super_keyword;

public class Vehicle {
	String colour;
	int weight;
	
	Vehicle(String colour, int weight){
		this.colour = colour;
		this.weight = weight;
	}
	
	void display() {
		System.out.println("Colour: "+colour);
		System.out.println("Weight: "+weight);
	}

}
