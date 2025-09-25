import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("enter your number to check armstrong or not :  ");
int num = input.nextInt();

if (isArmstrong(num)) {
	System.out.println(" is armstrong ");
}

else {
	System.out.println(" not armstrong ");
}
	}
	
	public static boolean isArmstrong(int num1) {
		int numCopy = num1;
		int nod = noOfDigits(num1);
		int finalNumber = 0;		
		while (num1>0) {
			int lastDigit = num1%10;
			finalNumber += power(lastDigit, nod);
			num1/=10;     //value of num k sath khilwad hua hai  toh in line 31 yor are checking with numCopy which is equal to actual num  ,refer line 21
						
		}
		System.out.println("final number   " +finalNumber);   //for debugging
		return finalNumber == numCopy;

		
	}
	
	public static int power(int num1, int num2) {
		int multiple = 1;
		int i =0;
		while (i < num2) {
			multiple *= num1;
			i++;
		}
		return multiple;
	}

	public static int noOfDigits(int num1) {
		int nod = 0;
		while(num1>0){
			nod++;
			num1/= 10;
		}
		System.out.println("nod " +nod);   //for debugging
		return nod;
	}
}
