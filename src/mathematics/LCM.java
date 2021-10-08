package mathematics;

import java.util.Scanner;

public class LCM {
	
	public static int lcm(int a,int b) {
		return (a*b)/GCD.gcd(a,b);
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(lcm(num1,num2));
	}

}
