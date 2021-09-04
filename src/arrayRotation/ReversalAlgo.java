package arrayRotation;

import java.util.Scanner;

public class ReversalAlgo {
	
	public static void leftRotation(int arr[],int d,int n) {
		d=d%n;
		revArray(arr,0,d-1);
		revArray(arr,d,n-1);
		revArray(arr,0,n-1);
	}
	
	public static void revArray(int arr[],int s,int e) {
		while(s<e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
	
	public static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		leftRotation(arr,d,n);
		printArray(arr,n);
		
		
	}

}
