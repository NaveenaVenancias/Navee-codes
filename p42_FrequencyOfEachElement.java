package zoho_assignment1;

import java.util.Scanner;

public class p42_FrequencyOfEachElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements to store in array: ");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		int freq[]=new int[array.length];
		int visited=-1;
		
		for(int i=0;i<array.length;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		System.out.println("Elements and Frequency");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println(array[i]+" -> "+freq[i]);
			}
		}
	}

}
