package Basic_problems;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of a series: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int n1=0, n2=1, sum=0;
		for(int i=2; i<num; i++) {
			sum = n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		

	}

}
