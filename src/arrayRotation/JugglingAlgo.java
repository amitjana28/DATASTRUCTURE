package arrayRotation;

import java.util.Scanner;

public class JugglingAlgo {
	
	public static void leftRotate(int arr[],int d,int n) {
		d=d%n;
		int i,j,k,temp;
		int g_c_d = gcd(d,n);
		
		for(i=0;i<g_c_d;i++) {
			temp = arr[i];
			j=i;
			while(true) {
				k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
		}
	}
	
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
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
