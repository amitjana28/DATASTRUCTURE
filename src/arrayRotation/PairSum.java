package arrayRotation;

import java.util.HashSet;
import java.util.Scanner;

public class PairSum {
	
	public static void printPair(int arr[],int sum,int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			int temp=sum-arr[i];
			if(s.contains(temp)) {
				System.out.print("Pair of sum "+sum+ "is ("+temp+ ","+arr[i]+")");
			}
			s.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printPair(arr,sum,n);

	}

}
