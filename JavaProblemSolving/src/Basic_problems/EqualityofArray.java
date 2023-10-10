package Basic_problems;

import java.util.Scanner;

public class EqualityofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] ar1 = new int[size];
		int[] ar2 = new int[size];
		
		System.out.println("The first array elements are: ");
		for(int i=0;i<size;i++) {
			ar1[i]= scanner.nextInt();
		}
		
		System.out.println("The second array elements are: ");
		for(int i=0;i<size;i++) {
			ar2[i]= scanner.nextInt();
		}
		scanner.close();
		boolean status = true;
		if(ar1.length!=ar2.length) {
			status = false;
		}
		else {
			for(int i=0;i<ar1.length;i++) {
				if(ar1[i]!=ar2[i]) {
					status= false;
					break;
				}
			}
		}
		if(status) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
			
		}

	}

}
