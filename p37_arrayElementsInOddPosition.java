package zoho_assignment1;

import java.util.Scanner;

public class p37_arrayElementsInOddPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to store in array: ");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("Odd position elements are: ");
		for(int i=0;i<array.length;i=i+2) {
			System.out.println(array[i]);
		}
	}

}
