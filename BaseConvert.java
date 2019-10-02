package lab1;
import java.util.Scanner;
public class BaseConvert
{
	public static void main (String[] args) {
		int base; // the new base
		int base10Num; // the number in base 10 intmaxNumber;
		int maxNumber; //themaximumnumberthatwillfit
               // in 4 digits in the new base
		int place0; // digit in the 1's (base^0) place
        int place1; // digit in the base^1 place
        int place2; // digit in the base^2 place
        int place3; //digit in the base^1 place
		//digit in the base^2 place
		//digit in the base^3 place
        String baseBNum = new String( ); // the number in the new base // the number in the new base
		Scanner scan = new Scanner(System.in);
		// read in the base 10 number and the base
		System.out.println();
		System.out.println ("Base Conversion Program");
		System.out.println() ;
		System.out.print ("Please enter a base (2-9): ");
		base = scan.nextInt();
		maxNumber = base *base * base * base - 1; //Compute the maximum base 10 number that will fit in 4 digits
		//in the new base and tell the user what range the number they
		//want to convert must be in
		System.out.print ("Please enter a base 10 number to convert (0- " + maxNumber + ") : ");
		base10Num = scan.nextInt();
		place0 = base10Num % base; // digit in the 1's (base^0) place
		place1 = (base10Num / base) % base;
		place2= ((base10Num / base) / base) % base;
		place3 = (((base10Num / base) / base) /base) % base;
		baseBNum = "" + place3 + place2 + place1 + place0; // the number in the new base
		//digit in the base^1 place
		//digit in the base^2 place
		//digit in the base^3 place  
		// Do the conversion (see notes in lab)
		System.out.println(baseBNum);
		//Print the result (see notes in lab)
	}

}

