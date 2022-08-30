package zoho_assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class p10_AlternateSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements of Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		int a1[]=new int[n];
		for(int i=0;i<n;i++) {
			a1[i]=sc.nextInt();
		}
		
		Arrays.sort(a1);
		
		int i=0,j = n-1;
		while(i<j) {
			System.out.print(a1[j--]+",");
			System.out.print(a1[i++]+",");
		}
		if(n%2!=0) {
			System.out.print(a1[i]);
		}
		
	}

}
