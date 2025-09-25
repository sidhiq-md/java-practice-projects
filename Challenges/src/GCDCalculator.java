import java.util.Scanner;

public class GCDCalculator {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("enter num1 : ");
int num1 = input.nextInt();
System.out.println("enter num2 : ");
int num2 = input.nextInt();
System.out.println("the gcd is :" + calculateGCD(num1, num2));


	}
	
	public static int calculateGCD(int number1, int number2) {
		int i =1;
		int gcd=1;
		int min = findMinimum(number1, number2);
		while(i <= min) {
			if(number1 % i == 0 && number2 % i ==0) {
				gcd =i;
			}
			i++;
			
		}
		return gcd;
	}
	
	public static int findMinimum(int number1, int number2) {
	 int min;
	 if(number1<number2) {
		 return number1;
	 }
	 else {
		 return number2;
	 }
	}
}
