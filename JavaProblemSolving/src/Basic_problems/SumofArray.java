package Basic_problems;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] a = new int[5];
		int sum=0;
		System.out.print("Enter the elements of an array: ");
		for(int i=0;i<5;i++) {
			a[i]= scanner.nextInt();
		}
		scanner.close();
		
		/*for(int i=0;i<5;i++) {
			sum=sum+a[i];
		}*/
		
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println("The sum of array is: "+sum);

	}

}
