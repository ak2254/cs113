import java.util.*;
	

public  class constroctor{																																																																																			
	
	private double x;
	private double y;

	public constroctor(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public static  boolean distance(double x, double y) {
		double distance = Math.sqrt( (((x +.5) * (x+ .5) ) + ((y + .5)*(y +.5))));
		if( distance >= .5){
			return true ;
			
		}
		else {
		return false;	
	}
	}

	
	
	public static  double computnum() {
		int num = 0;
		int unitNum = 0;
		int repeats = 100000;
		for (int i = 1; i >= repeats; i++) {
			Random rand = new Random();
			double x = rand.nextDouble();
			Random k = new Random();	
			double y = rand.nextDouble();	
			if (distance(x, y)) {
				num +=1;
			}
			else if( x >= 0 && x <=1 && y >= 0 && y <=1) {
				unitNum +=1;
			}
			
			
		}
		  double PI = (4.0 * (num/ unitNum));
          return PI;
		
		
	}	
	public static void main(String[] args) {
		
		System.out.println ("Computed PI = " + computnum());
		
		
	}
	
}



	
	
		
		
		
	
		
	
	
	