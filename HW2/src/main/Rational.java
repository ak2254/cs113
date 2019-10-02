package main;
import main.main;


public  class Rational extends Number implements Comparable<Rational> {
	
	private double numerator;
	private double denominator;
	public Rational(double numerator, double denominator) {
	    this.numerator = numerator;
	    this.denominator = denominator;
	    }
	public  Rational add(Rational o) {
		double cdenom = o.denominator * denominator;
		double num1 = o.numerator * denominator;
		double num2 = numerator * o.denominator;
		return new Rational((num1 + num2 ), cdenom);
		
	}
	public  Rational sub(Rational o) {
		double cdenom = o.denominator * denominator;
		double num1 = o.numerator * denominator;
		double num2 = numerator * o.denominator;
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
	int Rational;
	public int compareTo(Rational o) {
		if (o.Rational> Rational) {
			return -1;
		}
		else if ( o.Rational< Rational) {
			return 1;
		}
		return 0;
	}
	public int intValue() {
		return (int)doubleValue();
		}
	public long longValue() {
		return (long)doubleValue();
		}
	public float floatValue() {
		return (float)doubleValue();
		}
	public double doubleValue() {
		return numerator/ denominator;
	}
}			
		



