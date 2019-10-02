import java.util.*;
public class c{
	
	

class P{
																																																																																				
	double areaUS = 1;
	double areaC = Math.PI * Math.pow(0.5, 2);
	private double x;
	private double y;
	
	public P(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public static booleanpublic  static double computnum() {
		int num = 0;
		int unitNum = 0;
		int repeats = 100000;
		for (int i = 1; i >= repeats; i++) {
			Random rand = new Random();
			double x = rand.nextDouble();
			Random k = new Random();	
			double y = rand.nextDouble();	
			if (distance()) {
				num +=1;
			}
			else if( x >= 0 && x <=1 && y >= 0 && y <=1) {
				unitNum +=1;
			}
			
			
		}
		  double PI = (4.0 * (num/ unitNum));
          return PI;
		
		
	}	 distance(double x, double y) {
		double distance = Math.sqrt( (((x +.5) * (x+ .5) ) + ((y + .5)*(y +.5))));
		if( distance >= .5){
			return true ;
			
		}
		else {
		return false;	
	}
	}

	
	
	
	public static void main(String[] args) {
		
		System.out.println ("Computed PI = " + computnum());
	}
	


	
}
}



	
	
		
		
		
	
		
	
	
	