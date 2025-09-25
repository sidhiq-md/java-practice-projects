import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter your num");
int num = input.nextInt();
System.out.println(sumOfDigits(num));
	}
	
	public static int sumOfDigits(int num) {
		
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
		
	}

}
