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

