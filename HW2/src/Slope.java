import java.util.Scanner;
import java.util.Random;

public class Slope {
	public static void main(String[] args) {
//3.5 		
		
		Scanner scan = new Scanner(System.in);
		double x1, x2, y1, y2, slope;
		System.out.println("Enter the x1 value:");
		x1 = scan.nextDouble();
		System.out.println("Enter the y1 value: ");
		y1 = scan.nextDouble();
		System.out.println("Enter the x2 value:");
		x2 = scan.nextDouble();
		System.out.println("Enter the y2 value:");
		y2= scan.nextDouble();
		slope = (y2 - y1)/ (x2 - x1);
		System.out.println("The slope is " + slope) ;

//3.6 
		double volume, sa, r;
		System.out.println("Enter the radius of the sphere to calculate the volume and surface area:");
		r = scan.nextDouble();
		volume = (4/3) * Math.PI * Math.pow(r, 3);
		sa = 4 * Math.PI * Math.pow(r, 2);
		System.out.println("volume is:" + volume);
		System.out.println("Surface Area is "+ sa );
//3.7
		double a, b, h, area;
		System.out.println("enter the value for height:");
		h = scan.nextDouble();
		System.out.println("enter the length of one side:");
		a = scan.nextDouble();
		System.out.println("enter the length of the second side:");
		b = scan.nextDouble();
		area = ((a + b )/ 2) * h;
		System.out.println(area);
		
//3.9
		int hght , side , base,  perimeter, ar;
		Random rand = new Random();;
		hght = rand.nextInt(30) + 10;
		side = rand.nextInt(30) +10;
		base= rand.nextInt(30) + 10;
		perimeter = 2 *( side * hght);
		ar= base * hght; 
		System.out.println("perimeter: " + perimeter);
		System.out.println("area " +  ar);
	}
	

	
}
//4.3

public class MultiCircle {
	public static void main(String[] args) {
			
			Circle a = new Circle(2.0);
			Circle b = new Circle(3.0);
			System.out.println( "Circle with radius 2 has cercumfrence and area: " + a.cercum(a) + " and " + a.area(a));
			System.out.println( "Circle with radius 3 has cercumfrence and area: : " + b.cercum(b) + " and " + b.area(b));
			
		}
	}
class Circle{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
			
		}
	public double getRadius() {
		return radius;
		}
	public void setRadius(double radius) {
		this.radius = radius;
		}
	public Circle cercum(Circle o) {
		return new Circle(2 * Math.PI * o.radius);
		}
	public Circle area(Circle o) {
		return new Circle(Math.PI * Math.pow(o.radius, 2));
			
		}
 public String toString(){
    return " is " + radius;
}
}
//4.6
public class ShelfCheck {
	public static void main(String[] args) {
		
	}
	Shelf a = new Shelf(1.0, 5.0, 8.0);
	Shelf b = new Shelf(4.0, 9.0 ,6.0);	
	
}

class Shelf{
	private double length, breadth, capacity ;
	private boolean occupied;
	private double height, width;
	public Shelf(double height, double width, double capacity) {
		this.height = height;
		this.width = width;
		this.capacity = capacity;
	
		}
	public double getheigth() {
		return height;
		}
	public double getwidth() {
		return width;
		}
	public double getcapacity() {
		return capacity;
		}
	public void setheigth(double height) {
		this.height = height;
	}
	public void setwidth(double width) {
		this.width = width;
	}
	public void setcapacity(double capacity) {
		this.capacity = capacity;
	}
	
 public String toString(){
   return "The shelf has "  +  capacity + " capacity " + height + " height " + " width " + width;
   
   
}
}
