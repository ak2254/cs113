
public class Main {
	 public static void main(String[] args) {

	        Rational a = new Rational(2, 4);
	        Rational b = new Rational(2, 6);

	        System.out.println(a + " + " + b + " = " + a.add(b));
	        System.out.println(a + " - " + b + " = " + a.sub(b));
	        System.out.println(a + " * " + b + " = " + a.mul(b));
	        System.out.println(a + " / " + b + " = " + a.div(b));

	        Rational[] arr = {new Rational(7, 1), new Rational(6, 1),
	                          new Rational(5, 1), new Rational(4, 1),
	                          new Rational(3, 1), new Rational(2, 1),
	                          new Rational(1, 1), new Rational(1, 2),
	                          new Rational(1, 3), new Rational(1, 4),
	                          new Rational(1, 5), new Rational(1, 6),
	                          new Rational(1, 7), new Rational(1, 8),
	                          new Rational(1, 9), new Rational(0, 1)};

	        selectSort(arr);

	        for (int i = 0; i < arr.length-1; ++i) {
	            if (arr[i].compareTo(arr[i+1]) > 0) {
	                System.exit(1);
	            }
	        }

//	        for (Rational r : arr) {
//	            System.out.println(r);
//	        }

	        Number n = new Rational(3, 2);

	        System.out.println(n.doubleValue());
	        System.out.println(n.floatValue());
	        System.out.println(n.intValue());
	        System.out.println(n.longValue());
	    }

	    

		public static <T extends Comparable<? super T>> void selectSort(T[] array) {

	        T temp;
	        int mini;

	        for (int i = 0; i < array.length - 1; ++i) {

	            mini = i;

	            for (int j = i + 1; j < array.length; ++j) {
		            if (array[j].compareTo(array[mini]) < 0) {
		                mini = j;
		            }
	            }

	            if (i != mini) {
		            temp = array[i];
		            array[i] = array[mini];
		            array[mini] = temp;
	            }
	        }
	    }

public class Rational extends Number implements Comparable<Rational> {
	private int numerator;
	private int denominator;
	public Rational(int numerator, int denominator) {
	    this.numerator = numerator;
	    this.denominator = denominator;
	    }
	public int compareTo(Rational rational) {
		// TODO Auto-generated method stub
		return 0;
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
	public int intValue() {
		return (int)intValue();
	}
	
	public long longValue() {
		return (long)longValue();
	}
	
	public float floatValue() {
		
		return (float)floatValue();
	}
	
	public double doubleValue() {
		
		return (double)doubleValue();
	}
	
}
}
