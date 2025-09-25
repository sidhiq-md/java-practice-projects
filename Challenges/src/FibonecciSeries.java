import java.util.Scanner;

public class FibonecciSeries {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter number upto which u want to print the fibonecci series :  ");
int num = input.nextInt();
printFibonecci(num);
	}
	
	public static void printFibonecci(int num) {
		
		if(num < 0) {
			return;
		}
		System.out.print("0 ");
		
		if(num ==0) {
			return;
		}
			System.out.print("1 ");
		
			
			int first = 0;
			int second = 1;
			
			while(first + second  <= num) {
			int	third = first + second;
			System.out.print(third + " ");
			first =second;
			second = third;
		
				
			}
	}

}
