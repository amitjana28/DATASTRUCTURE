package array;

public class Array {

	public static void main(String[] args) {
		int arr[];
		arr = new int[5];
		

		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		
		
		int arr2[] = new int[5];
		
		arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		arr2[3]=400;
		arr2[4]=500;
		
		
		
		
		int arr3[] = new int[] {15,25,35,45,65,75,85};
		
		
		
		for(int i=0;i<arr.length;i++)
			System.out.println("Element at index " + i + ":" + arr[i]);
		
		for(int i=0;i<arr2.length;i++)
			System.out.println("Element at index " + i + ":" + arr2[i]);
		
		for(int i=0;i<arr3.length;i++)
			System.out.println("Element at index " + i + ":" + arr3[i]);
		// TODO Auto-generated method stub

	}

}
