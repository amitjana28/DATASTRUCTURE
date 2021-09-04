package array;

import java.util.Scanner;

public class MinMax {
	
	public static void minmax(int arr[],int n) {
		int min,max;
		min=max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min)
				min=arr[i];
//		write remaining code here	
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		minmax(arr,n);

	}

}
