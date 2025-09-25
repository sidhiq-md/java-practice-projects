import java.util.Scanner;

public class LCMCalculator {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter num1");
int num1 = input.nextInt();
System.out.println("enter num2");
int num2 = input.nextInt();
int factor = calculateLCM(num1, num2);
System.out.println("the lcm is : " + factor);
	}

	
	public static int calculateLCM(int num1, int num2) {
		int i=1;
		while( true) {				          // i<= num2   	//because the answer will be must and should inside the if condition theres no other (else) condition
			if(((num1*i) % num2) ==0) {
				return (num1*i);
			}
			i++;
		}
	//	return 0;      //same reason as mentioned above.
	}

}
