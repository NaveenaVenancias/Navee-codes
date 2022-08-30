package zoho_assignment1;

import java.util.Scanner;

public class p57_NumberPattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int a=sc.nextInt();
		int n=String.valueOf(a).length();
		
		int array[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			array[i]=a%10;
			a=a/10;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==j)||(i+j==n+1)) {
					System.out.print(array[j-1]+"");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
