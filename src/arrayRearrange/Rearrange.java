package arrayRearrange;

import java.util.HashSet;
import java.util.Scanner;

import arrayRotation.ArrayRotation;

public class Rearrange {
	
	public static void rearrange(int arr[],int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			s.add(arr[i]);
		}
		for(int i=0;i<n;i++) {
			if(s.contains(i))
				arr[i]=i;
			else
				arr[i]=-1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		rearrange(arr,n);
		ArrayRotation.printArray(arr,n);

	}

}
