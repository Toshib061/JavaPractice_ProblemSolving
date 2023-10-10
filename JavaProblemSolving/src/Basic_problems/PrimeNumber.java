package Basic_problems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();
		int count = 0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("It's a prime number");
			}
			else {
				System.out.println("It's not a prime number");
			}
			
		}
		else {
			System.out.println("It's not a prime number");
		}

	}

}
