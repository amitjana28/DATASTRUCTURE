package arrayRotation;

import java.util.Scanner;

public class ArrayRotation {
	
	public static void leftRotate(int arr[], int key, int n) {
		for(int i=0;i<key;i++) {
			leftRotateOneByOne(arr,n);
		}
	}
	
	public static void leftRotateOneByOne(int arr[],int n) {
		int temp;
		temp = arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
	
	public static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		leftRotate(arr,k,n);
		printArray(arr,n);

	}

}
