package mathematics;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void fibbonacci(int n) {
		if(n==0)
			System.out.print(0);
		else if(n==1)
			System.out.print(0+" "+1);
		else {
			int a=0;
			int b=1;
			System.out.print(a+" "+b+" ");
			for(int i=2;i<=n;i++) {
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		fibbonacci(n);
		

	}

}
