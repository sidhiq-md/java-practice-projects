import java.util.Scanner;

public class AddOddNumbers {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter value for n : ");
int n = input.nextInt();
//sumOfOddNumbers(n);
System.out.println(sumOfOddNumbers(n));
	}
	
	public static int sumOfOddNumbers(int n) {
		
		int i= 1;
	int sum = 0;
		while(i <= n) {
			sum += i;
			i += 2;
		}
		
		return sum;
		
	}

}
