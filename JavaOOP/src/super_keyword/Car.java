package super_keyword;

public class Car extends Vehicle {
	int height;
	
	Car(String colour,int weight,int height){
		super(colour,weight);
		this.height = height;
	}
	
	void display() {
		super.display();
		System.out.println("height: "+height);
	}

}
