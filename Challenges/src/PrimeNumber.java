import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println("enter your num : ");
int num = input.nextInt();
boolean isPrime = isPrime(num);
if(isPrime) {
	System.out.println("it is a prime number");
}
else
{
	System.out.println("it is not a prime number");
}
	}

	
	public static boolean isPrime(int num) {
		int i =2;
		while (i <num) {
			if(num % i == 0) {
				return false;
			}
			i++;
			
		}
		return true;
	}
}
