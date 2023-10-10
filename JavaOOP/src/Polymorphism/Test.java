package Polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape[] s = new shape[3];
		s[0] = new shape();
		s[1] = new rectangle(10,20);
		s[2] = new triangle(10,20);
		
		for(int i=0;i<3;i++) {
			System.out.println(s[i].area());	
		}
		
		

	}

}
