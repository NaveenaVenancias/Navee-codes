package zoho_assignment1;

import java.util.Scanner;

public class p3_DifferenceOfNumAndReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int number=num;
		int reverse=0;
		
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		
		System.out.println("Reverse of the number: "+reverse);
		System.out.println("Difference of the number: "+(num-reverse));
	}

}
