package Polymorphism;

public class rectangle extends shape{
	double height,width;
	
	rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	double area() {
		System.out.print("The area of the rectangle is:");
		return height*width;
	}

}
