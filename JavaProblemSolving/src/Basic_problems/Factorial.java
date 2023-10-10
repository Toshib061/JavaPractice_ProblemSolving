package Basic_problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of "+num+" is: "+fact);
		
		
				

	}

}
