package Basic_problems;

import java.util.Scanner;

public class FindingMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		System.out.print("Enter values of an array: ");
		for(int i=0;i<a.length;i++) {
			a[i]= scanner.nextInt();
		}
		scanner.close();
		int max = a[0];
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("The max value is: "+max);
		System.out.println("The min value is: "+min);

	}

}
