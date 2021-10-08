package mathematics;
import java.io.*;

public class AP {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Value of first term of AP:");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Value of common differnce of AP:");
		int d = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the nth term of AP:");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("Value of "+n+" term is "+(a+(n-1)*d));

	}

}
