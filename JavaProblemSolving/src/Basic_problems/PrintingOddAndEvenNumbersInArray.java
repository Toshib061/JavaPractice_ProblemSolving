package Basic_problems;

import java.util.Scanner;

public class PrintingOddAndEvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] a = new int[6];
		System.out.print("Enter the elements of an array: ");
		for(int i=0;i<a.length;i++) {
			a[i]= scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("The Even numbers are: ");
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		System.out.println("The Odd numbers are: ");
		for(int value:a) {
			if(value%2!=0) {
				System.out.println(value);
			}
		}

	}

}
