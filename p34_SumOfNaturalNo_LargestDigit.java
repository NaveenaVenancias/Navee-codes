package zoho_assignment1;

import java.util.Scanner;

public class p34_SumOfNaturalNo_LargestDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Ending Number: ");
		int b=sc.nextInt();
		int sum=sumOfNaturalNumbers(a,b);
		largestDigit(sum);
	}
	public static int sumOfNaturalNumbers(int x,int y) {
		int sum=0;
		while(x<=y) {
			sum=sum+x;
			x++;
		}
		System.out.println("Sum of Natural Numbers is "+sum);
		return sum;
	}
	public static void largestDigit(int s) {
		int largest=0;
		while(s!=0) {
			int n=s%10;
			largest=Math.max(largest, n);
			s=s/10;
		}
		System.out.println(largest+" is the largest digit");
	}

}
