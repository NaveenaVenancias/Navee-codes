package zoho_assignment1;

import java.util.Scanner;

public class p35_Factorial_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to find Factorial: ");
		int a=sc.nextInt();
		int fact_num=factorial(a);
		sumOfDigits(fact_num);
	}
	public static int factorial(int x) {
		int num=1;
		if(x!=0) {
			for(int i=1;i<=x;i++) {
				num=num*i;
			}
		}
		System.out.println("Factorial of the "+x+" is "+num);
		return(num);
	}
	public static void sumOfDigits(int a) {
		int n=0;
		while(a!=0) {
			int r=a%10;
			n=n+r;
			a=a/10;
		}
		System.out.println("Sum of the digits is "+n);
	}

}
