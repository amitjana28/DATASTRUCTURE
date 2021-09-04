package arrayimportant;

import java.util.Scanner;

public class SubarraySum {
	
	public static int subarraySum(int arr[],int sum,int n) {
		int currSum,i,j;
		for(i=0;i<n;i++) {
			currSum=arr[i];
			for(j=i+1;i<=n;j++) {
				if(currSum==sum) {
					int p=j-1;
					System.out.println("Sum found btw indx " + i+ " and "+ p);
					return 1;
				}
				if(currSum>sum|| j==n)
					break;
				currSum=currSum+arr[j];
			}
		}

		System.out.println("No Subarray Found!");
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		subarraySum(arr,sum,n);

	}

}
