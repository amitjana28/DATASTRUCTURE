package mathematics;

import java.util.Scanner;

public class GCD {
	
	public static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(gcd(num1,num2));
		
	}

}
