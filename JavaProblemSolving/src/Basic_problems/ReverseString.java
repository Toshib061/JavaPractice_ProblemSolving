package Basic_problems;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		sc.close();
		String rev = "";
		/*int len = str.length();
		
		for(int i= len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}*/
		
		//Using Character array
		char a[] = str.toCharArray();
		int len = a.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("The reverse string is: "+rev);

	}

}
