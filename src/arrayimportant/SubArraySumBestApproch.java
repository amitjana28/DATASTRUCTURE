package arrayimportant;

import java.util.Scanner;

public class SubArraySumBestApproch {
	
	public static int subArraySum(int arr[],int sum,int n) {
		int curr_sum=arr[0],start=0;
		for(int i=1;i<=n;i++) {
			while(curr_sum>sum && start <i-1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if(curr_sum==sum) {
				int p=i-1;
				System.out.println("Sum Found btw "+start+" and "+p);
				return 1;
			}
			if(i<n)
				curr_sum=curr_sum+arr[i];
		}
		System.out.println("Sum Not FOund");
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		subArraySum(arr,sum,n);
	}

}
