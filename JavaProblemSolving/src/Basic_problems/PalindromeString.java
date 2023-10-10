package Basic_problems;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next(); // input= madam
		sc.close();
		String org_str = str;
		String rev = "";
		int len = str.length(); // len = 5
		
		for(int i= len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if(org_str.equals(rev)) {
			System.out.println("It's a palindrome string");
		}
		else {
			System.out.println("It's not a palindrome string");
		}

	}

}
