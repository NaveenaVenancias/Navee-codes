package zoho_assignment1;

import java.util.Scanner;

public class p60_SumOfSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of terms: ");
		int n=sc.nextInt();
		series(n);
	}
	public static void series(int n) {
		int seriesNumber=0;
		int sum=0;
		System.out.println();
		for(int i=1;i<=n;i++) {
			seriesNumber=seriesNumber*10+1;
			System.out.print(seriesNumber+"+");
			sum=sum+seriesNumber;
		}
		System.out.println();
		System.out.println("Sum the series elements: "+sum);
	}
}
