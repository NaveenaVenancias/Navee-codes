package zoho_assignment1;

import java.util.Scanner;

public class p46_RightRotationOfArray {

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
			int j,last;
			last=array[array.length-1];
			for(j=array.length-1;j>0;j--) {
				array[j]=array[j-1];
			}
			array[0]=last;
		}
		System.out.println("Array after right rotation: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
	}

}
