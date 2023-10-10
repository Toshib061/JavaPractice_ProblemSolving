package Basic_problems;

import java.util.Scanner;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = scanner.nextInt();
		
		int ar1[] = new int[size];
		System.out.println("The array elements are: ");
		for(int i=0;i<size;i++) {
			ar1[i]= scanner.nextInt();
		}
		scanner.close();
		boolean status = false;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(ar1[i]==ar1[j]) {
					System.out.println("Found Duplicate element is: "+ar1[i]);
					status = true;
				}
			}
		}
		if(status==false) {
			System.out.println("Duplicate elements not found");
		}

	}

}
