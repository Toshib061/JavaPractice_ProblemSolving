package problem_solving_1;

public class Box {
	double height,width;
	double depth;
	
	
	Box(double height,double width,double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	void displayVol() {
		System.out.println("The volume is: "+ height*width*depth);
	}

}
