package Basic_problems;

import java.util.Scanner;

public class Counting_EVEN_ODD_Digits_in_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("The number of even digits is:"+even_count);
		System.out.println("The number of odd digits is:"+odd_count);
		

	}

}
