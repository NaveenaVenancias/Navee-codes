package zoho_assignment1;

import java.util.Scanner;

public class p56_NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		int a=sc.nextInt();
		int n=valueOfN(a);
		printPattern(n);		
	}
	public static int valueOfN(int a) {
		int sum=0;
		for(int i=1;sum<a;i++) {
			sum=sum+i;
			if(sum==a) {
				return i;
			}
		}
		return -1;
	}
	public static void printPattern(int n1) {
		int startingValue=1;
		for(int i=0;i<n1;i++) {
			for(int j=i;j<n1-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print((startingValue++)+" ");
			}
			System.out.println();
		}
	}
}
