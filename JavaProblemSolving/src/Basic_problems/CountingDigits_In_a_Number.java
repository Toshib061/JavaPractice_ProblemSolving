package Basic_problems;

import java.util.Scanner;

class CountingDigits_In_a_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
			
		}
		System.out.println("The number of digits is: "+count);
		

	}

}
