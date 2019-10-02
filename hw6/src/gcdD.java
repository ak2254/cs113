//2
import java.util.Scanner;

public class gcdD {
	

	public static void main(String args[])

	{
		System.out.println("enter the first  number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("enter the second number");
		int num2 = scan.nextInt();
		
		int gcd1 = gcd.DivisorCalc(num1, num2);
		System.out.println("the gcd is " + gcd1);

		
		
		
		
	}
}



	


