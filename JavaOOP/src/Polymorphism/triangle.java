package Polymorphism;

public class triangle extends shape{
	double height,base;
	
	triangle(double height, double base){
		this.height = height;
		this.base= base;
		
	}
	
	double area() {
		System.out.print("The area of the triangle is:");
		return 0.5*height*base;
	}

}
