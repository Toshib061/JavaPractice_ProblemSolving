package Basic_problems;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		sc.close();
		// Natural logic
		
		/*if(a>b && a>c) {
			System.out.println(a+"is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+"is the largest number");
		}
		else {
			System.out.println(c+ "is the largest number");
		}*/
		
		//Ternary operator
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("The largest number is: "+largest);

	}

}
