package Basic_problems;

import java.util.Arrays;

public class CheckTheEqualityofArray {
	
	public static void main(String[] args) {
		 int ar1[] = {1,2,3,4,6};
		 int ar2[] = {1,2,3,4,5};
		 
		 /*boolean status = Arrays.equals(ar1, ar2);
		 if(status==true) {
			 System.out.println("Arrays are equal");
		 }
		 else {
			 System.out.println("Arrays are not equal");
		 }*/
		 
		 boolean status= true;
		 if(ar1.length==ar2.length) {
			 for(int i=0;i<ar1.length;i++) {
				 if(ar1[i]!=ar2[i]) {
					 status=false;
				 }
			 }
		 }
		 else {
			 status=false;
		 }
		 if(status==true) {
				System.out.println("Arrays are equal");
			}
		 else {
			 System.out.println("Arrays are not equal");
		 }
	}
	

}
