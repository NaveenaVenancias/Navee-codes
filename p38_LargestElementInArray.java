package zoho_assignment1;

import java.util.Scanner;

public class p38_LargestElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to store in array: ");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The largest element of the array is "+max);
	}

}
