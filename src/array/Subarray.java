package array;

import java.util.Scanner;

public class Subarray {
	
	public static void allSubArray(int arr[],int s,int e) {
		if(e==arr.length)
			return;
		else if(s>e) {
			allSubArray(arr,0,e+1);
		}
		else
		{
			System.out.print("{");
			for(int i=s;i<e;i++)
				System.out.print(arr[i]+", ");
			System.out.print(arr[e]+"}");
			allSubArray(arr,s+1,e);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		allSubArray(arr,0,0);

	}

}
