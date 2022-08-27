package zoho_assignment1;

import java.util.Scanner;

public class p51_ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int a=sc.nextInt();
		
		int num=0,r=0;
		while(a!=0) {
			r=a%10;
			num=(num*10)+r;
			a=a/10;
		}
		System.out.println("Reverse of the number: "+num);
	}

}
