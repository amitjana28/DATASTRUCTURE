package searching;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int n,int ele) {
		int i=0;
		while(i<n) {
			if(arr[i]==ele)
				return i+1;
			i++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ele = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		int result =linearSearch(arr,n,ele);
		if(result==0)
			System.out.println("Element not found");
		else
			System.out.println("Element "+ele+ " present at "+result+ " position");

	}

}
