
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