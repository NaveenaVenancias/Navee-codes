package zoho_assignment1;

import java.util.Scanner;

public class p43_LeftRotationOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to store in array: ");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of times wants to rotate: ");
		int rotate=sc.nextInt();
		
		for(int i=0;i<rotate;i++) {
			int j;
			int first=array[0];
			
			for(j=0;j<array.length-1;j++) {
				array[j]=array[j+1];
			}
			array[j]=first;
		}
		
		System.out.println("Array after the rotation: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" , ");
		}
	}

}
