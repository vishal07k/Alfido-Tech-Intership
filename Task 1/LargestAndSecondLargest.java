package alfidoprojecttask1;
import java.util.*;

public class LargestAndSecondLargest {

	public void printLargestAndSecondLargest(int arr[]) {
		
		int largest = arr[0], secondLargest = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest && arr[i] > secondLargest) {
				secondLargest = largest;
				largest = arr[i];
			}
		}
		System.out.println("Largest : " + largest + "\n Second Largest : " + secondLargest);
	}
	
	public static void main(String args[]) {
		
		LargestAndSecondLargest op = new LargestAndSecondLargest();
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		System.out.println("Enter 10 numbers : ");
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		op.printLargestAndSecondLargest(arr);
	}
}
