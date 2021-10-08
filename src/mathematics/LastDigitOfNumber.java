package mathematics;
import java.io.*;

public class LastDigitOfNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number :");
		int n = Integer.parseInt(br.readLine());
		int y=Math.abs(n);
		
		System.out.print("Last digit of the number is :"+ y%10);
		
		// TODO Auto-generated method stub

	}

}
