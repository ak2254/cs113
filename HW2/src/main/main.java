package main;

public class main {
	public static void main(String[] args) {

	    Rational a = new Rational(2, 3);
	    Rational b = new Rational(1, 2);

	    System.out.println(a + " + " + b + " = " + a.add(b));
	    System.out.println(a + " - " + b + " = " + a.sub(b));
	   System.out.println(a + " * " + b + " = " + a.mul(b));
	   System.out.println(a + " / " + b + " = " + a.div(b));
	  }
	}
class Rational{
	private int numerator;
	private int denominator;
	public Rational(int numerator, int denominator) {
	    this.numerator = numerator;
	    this.denominator = denominator;
	    }
	public  Rational add(Rational o) {
		int cdenom = o.denominator * denominator;
		int num1 = o.numerator * denominator;
		int num2 = numerator * o.denominator;
		return new Rational((num1 + num2 ), cdenom);
		
	}
	public  Rational sub(Rational o) {
		int cdenom = o.denominator * denominator;
		int num1 = o.numerator * denominator;
		int num2 = numerator * o.denominator;
		return new Rational((num2 - num1), cdenom);
		
	}
	public  Rational mul(Rational o) {
		return new Rational((numerator * o.numerator ), (denominator * o.denominator));
		
		
	}
	public  Rational div(Rational o) {
		return new Rational((numerator * o.denominator ), (o.numerator * denominator));
		
		
	}
	public int gcd(int x, int y) {
		int r = 1;
		int num = 0;
		while( r != 0) {
			if( x > y) {
				x = y * (x/y) + (x%y);
				r = x%y;
				num = x;
			}
			else if (y > x) {
				y = x * (y/x) + (y%x);
				r = y%x;
				num = y;
			}
		}
		return num;
	}
	public String toString ()
	   {
	      if (numerator == 0)
	          return( "0");
	      else if (denominator == 1)
	            return(numerator + " ");
	       else
	           return(numerator + "/" + denominator );
	   }

}


