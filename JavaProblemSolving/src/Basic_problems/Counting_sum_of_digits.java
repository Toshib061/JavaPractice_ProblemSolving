package Basic_problems;

import java.util.Scanner;

public class Counting_sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int sum=0;
		while(num>0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("The sum of the digits of the number is: "+sum);

	}

}
