import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number   ");
		int num = input.nextInt();
		System.out.println(digitReverse(num));
	}
	public static int digitReverse(int num) {
	int reverse = 0;
	while(num>0) {
		int digit = num % 10 ;
		reverse = (reverse *10) + digit;
		num = num/10;	
	}
	return reverse;
	}
}


