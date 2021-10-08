package mathematics;
import java.io.*;

public class GP {
	
	public static int nthGP(int a,int r,int n) {
		int result = a*(int)Math.pow(r, n-1);
		return result;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the First term of GP :");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the common ratio of GP :");
		int r = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Nth term of GP :");
		int n = Integer.parseInt(br.readLine());
		
		System.out.print("The value of nth term of GP is :"+ nthGP(a,r,n));
		
		// TODO Auto-generated method stub

	}

}
