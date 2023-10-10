package Basic_problems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int org_num = num;
		int rev= 0;
		
		while(num!=0) {
			rev= rev*10 + num%10;
			num = num/10;
		
		}
		if(org_num==rev) {
			System.out.println("It's a palindrome number");
		}
		else {
			System.out.println("It's not a palindrome number");
		}

	}

}
