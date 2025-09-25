import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter number for which you want to calculate factoreal");
int num = input.nextInt();
System.out.println(calculateFactorial(num));

	}
	
	public static long calculateFactorial(int num) {
long fact =1;
if(num<2) {
  return 1;
}
int i =2;
while(i<=num) {
	fact = fact*i;
	i++;
}
		return fact;
	}

}
