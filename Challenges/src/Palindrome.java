import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter your number");
int num = input.nextInt();
if(isPalindrom(num)) {
	System.out.println("is a palindrome");
}

else {
System.out.println("not a palindrome");	
}
	}
	
	public static boolean isPalindrom(int num) {
		
		
			return num == reverse(num);
			
	}
		
	public static int reverse(int num) {
		int reverse = 0;
		int digit = 0;
		while( num > 0) {
			digit = num%10;
			reverse = (reverse*10) + digit;
			num /= 10;
		}
		return reverse;
	}
}
