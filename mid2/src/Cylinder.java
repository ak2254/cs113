//11
public class Cylinder extends circle{
	
	private static double height;
	public Cylinder(double r, double height) {
		super(r);
		this.height = height;
		
		
	}
	public double getheight() {
		return height;	
	}
	public void setheight() {
		this.height = height;
		
	}
	public boolean equals(Object o) {
		if( o == this) {
			return true;
		}
		else {
			return false;
		}
	}
}
