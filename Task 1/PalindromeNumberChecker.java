package alfidoprojecttask1;

import java.util.Scanner;

public class PalindromeNumberChecker {

	public boolean isPalindrome(int num) {
		int temp = num, result = 0;
		while(num > 0) {
			
			result = (result * 10) + num%10;
			num = num/10;
			
		}
		if(temp == result) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		PalindromeNumberChecker op = new PalindromeNumberChecker();
		System.out.println(op.isPalindrome(num)? "Number is palindrom" : "Number is not palinrom");
	}
}
