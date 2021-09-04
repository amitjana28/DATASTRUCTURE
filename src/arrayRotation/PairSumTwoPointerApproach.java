package arrayRotation;

import java.util.Scanner;

public class PairSumTwoPointerApproach {
	
	public static boolean printPairSum(int arr[],int sum,int n) {
		int s=0,e=n-1;
		while(s<e) {
			if(arr[s]+arr[e]<sum)
				s++;
			else if(arr[s]+arr[e]>sum)
				e--;
			else 
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(printPairSum(arr,sum,n))
			System.out.print(true);
		else
			System.out.print(false);// TODO Auto-generated method stub

	}

}
