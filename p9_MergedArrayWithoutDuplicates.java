package zoho_assignment1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class p9_MergedArrayWithoutDuplicates {

	public static void main(String[] args) {
		int x=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of elements to store in 1st Array: ");
		int n1=sc.nextInt();
		int a1[]=new int[n1];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n1;i++) {
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the no of elements to store in 1st Array: ");
		int n2=sc.nextInt();
		int a2[]=new int[n2];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n2;i++) {
			a2[i]=sc.nextInt();
		}
		
		int mergeArray[]=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			mergeArray[x]=a1[i];
			x++;
		}
		for(int i=0;i<a2.length;i++) {
			mergeArray[x]=a2[i];
			x++;
		}
		
		Set ArraySet=new HashSet<>();
		for(int m=0;m<mergeArray.length;m++) {
			ArraySet.add(mergeArray[m]);
		}
		
		Iterator it=ArraySet.iterator();
		int n=0;
		int mergedArrayWithoutDuplicates[]=new int[ArraySet.size()];
		while(it.hasNext()) {
			mergedArrayWithoutDuplicates[n]=(int) it.next();
			n++;
		}
		System.out.println("mergedArrayWithoutDuplicates");
		for(int i=0;i<mergedArrayWithoutDuplicates.length;i++) {
			System.out.println(mergedArrayWithoutDuplicates[i]);
		}
	}

}
