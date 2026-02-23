package alfidoprojecttask1;
import java.util.*;

public class EvenOddCountArray {
	
	public int countofEvenNumbers(int arr[]) {
		int i=0, count = 0;
		for(i=0; i< arr.length; i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		return count;
	}
	
	public int countofOddNumbers(int arr[]) {
		int i=0, count = 0;
		for(i=0; i< arr.length; i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]) {
		
		int arr[]=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Random Numbers : ");
		for(int i=0; i<10;i++) {
			arr[i]=sc.nextInt();
		}
		EvenOddCountArray t1 = new EvenOddCountArray();
		System.out.println("Count of Even numbers :" + t1.countofEvenNumbers(arr));
		System.out.println("Count of Odd numbers :" + t1.countofOddNumbers(arr));
	}
}
