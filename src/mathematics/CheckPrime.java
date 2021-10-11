package mathematics;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean checkPrime(int n) {
		if(n==1)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for(int i=5;i*i<n;i+=6) {
			if(n%i==0||n%(i+2)==0)
				return false;
		}
		return true;
	}
	
//	public static boolean checkPrime(int n) {
//		if(n==1)
//			return false;
//		int i=2;
//		while(i*i<n) {
//			if(n%i==0) {
//				return false;
//			}	
//			i++;
//		}
//		return true;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		boolean c=checkPrime(n);
		if(c==true)
			System.out.println("It is prime");
		else
			System.out.println("It is not prime");

	}

}
