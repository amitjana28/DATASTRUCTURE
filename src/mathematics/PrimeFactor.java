package mathematics;

import java.util.Scanner;

public class PrimeFactor {
	
	public static void primeFactor(int a) {
		while(a%2==0) {
			System.out.print("2 ");
			a=a/2;
		}
		
		for(int i=3;i*i<=a;i+=2) {
			while(a%i==0) {
				System.out.print(i+" ");
				a/=i;
			}
		}
		if(a>2)
			System.out.print(a);
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
	    primeFactor(num1);
	}

}
