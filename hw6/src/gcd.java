//12.2

import java.util.*;
public class gcd {

	public static int DivisorCalc(int num1,int num2){
		if(num2%num1 ==0) {
			return num1;
		}
		return DivisorCalc(num2, num1%num2);
	}
}

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
//12.6
public class Queen {
	private static int size = 8;
	private static int[] k;
	public Queen() {
		this.k = new int[size];
		
	}
	public static boolean qp(int c, int num ) {
		for (int i = 0; i <num; i++) {
			if(k[i] == c) {
				return false;
			}
			if(k[i -1] == k[i]) {
				return false;
			}
			
		}
		return true;
	}

public static void row(int num) {
	for( int i = 0; i <= size-1; i++) {
		if(!(num +1 >=size)) {
			row(num +1);
		}
		ans();
		
	}
}
private static void ans() {
	int ch = 0;
	for(int i = 0; i <= size-1; i++) {
		for(int h = 0; h<=size-1; h++) {
			if(k[i] != ch ) {
				System.out.println("NQ");
			}
			System.out.println("Q");
				
			}
			
		}
	}
	
}

	
	



	