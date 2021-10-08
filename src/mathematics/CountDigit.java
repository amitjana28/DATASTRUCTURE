package mathematics;
import java.io.*;

public class CountDigit {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number : ");
		int n = Integer.parseInt(br.readLine());
		int counter=0;
		while(true) {
			n = n/10;
			counter++;
			if(n==0) 
				break;
		}
		System.out.print(counter);
		
	}

}
