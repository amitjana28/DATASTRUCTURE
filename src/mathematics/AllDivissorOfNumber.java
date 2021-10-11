package mathematics;

import java.util.Scanner;

public class AllDivissorOfNumber {
	
	public static void divissiorOfNumber(int n) {
		int i;
//		while(i*i<n) {
//			if(n%i==0) {
//				System.out.print(i+" ");
//			}
//			i++;
//		}
//		while(i>=1) {
//			if(n%i==0) {
//				System.out.print((n/i)+" ");
//			}
//			i--;
//		}
		
		
		for(i=1;i*i<n;i++) {
			if(n%i==0)
				System.out.print(i +" ");
		}
		for( ;i>=1;i--) {
			if(n%i==0) {
				System.out.print(n/i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		divissiorOfNumber(n);
		

	}

}
