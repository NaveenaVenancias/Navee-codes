package zoho_assignment1;

import java.util.Scanner;

public class p31_QuadraticEquation {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the values of a,b,c: ");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			double value=0,r1=0,r2=0,real,imaginary;
			value=(b*b)-(4*a*c);
			
			if(value>0) {
				r1=((-b)+Math.sqrt(value))/(2*a);
				r2=((-b)-Math.sqrt(value))/(2*a);
				System.out.println("R1 = "+r1+"; R2 = "+r2);
			}
			else if(value==0) {
				r1=(-b)/(2*a);
				r2=(-b)/(2*a);
				System.out.println("R1 = "+r1+"; R2 = "+r2);
			}
			else if(value<0) {
				real=(-b)/(2*a);
				imaginary=Math.sqrt((-value)/2*a);
				System.out.println("R1 = "+real+"+"+imaginary+"; R2 = "+real+"-"+imaginary);
			}
		

	}

}
