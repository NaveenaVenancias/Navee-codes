package zoho_assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p54_OddPositionsDesendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements of Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		int a1[]=new int[n];
		for(int i=0;i<n;i++) {
			a1[i]=sc.nextInt();
		}
		oddPositionDesending(a1);
	}
	public static void oddPositionDesending(int a[]) {
		if(a.length<3) {
			print(a);
		}
		
		List<Integer> odd=new ArrayList<>();
		List<Integer> even=new ArrayList<>();
		int output[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				even.add(a[i]);
			}
			else {
				odd.add(a[i]);
			}
		}
		
		Collections.sort(even);
		Collections.sort(odd);
		Collections.reverse(odd);
		
		int j=0,k=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				output[i]=even.get(j++);
			}
			else {
				output[i]=odd.get(k++);
			}
		}
		print(output);
		
	}
	public static void print(int a[]) {
		int i=0;
		for(i=a.length-1;i>0;i--) {
			System.out.print(a[i]+",");
		}
		System.out.print(a[i]);
	}
}
