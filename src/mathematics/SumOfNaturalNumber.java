package mathematics;
import java.util.Scanner;

public class SumOfNaturalNumber {
	
//	best approach
	
public static int sumOfNaturalNumber(int n) {
		
		int result= n*(n+1)/2;
		return result;
	}
	

//normal approach
/*	public static int sumOfNaturalNumber(int n) {
		
		int result=0;
		for(int i=1;i<=n;i++) {
			result+=i;
		}
		return result;
	}*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Nth term :");
		int n = sc.nextInt();
		
		System.out.print("Sum the N natural number is :"+sumOfNaturalNumber(n));
		sc.close();

	}

}
