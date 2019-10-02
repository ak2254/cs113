
import java.util.Random;

public class PI
{ 
	   public static void main (String[] args)
       
       {
      
          System.out.println ("The new PI = " + c.computepi() );    
   
       }
}
class c{
	public static boolean distance(double x, double y ) {
		
		double distance = Math.sqrt( (((x +.5) * (x+ .5) ) + ((y + .5)*(y +.5))));
		if ( distance <= .5) {
			return true;
		}
		else {
			return false;
		}
		}



	public static boolean unitS(double x, double y) {
		if( x >= 0 && x <=1 && y >= 0 && y <=1) {
			return true;
		}
		else {
			return false;
		}
		}
	
		
	public  static double computnum() {
		
		Random rand = new Random();
		double repeats = 10000000;
		double num = 0;
		double unitNum = 0;
		double max = 1.0;
		double min = 0.0;
		double range =( max - min )+ 1;
		
		
		
		while ( repeats != -1) {
			
			
			double x = (((rand.nextDouble() * range)) - max );
			
			double y =  (((rand.nextDouble()* range)) - max) ;	
			if (distance(x, y) == true) {
				num +=1;
			}
			if (unitS(x, y) == true) {
				unitNum +=1;
			}
			
			repeats -=1;
			
		}
		double x = (num / unitNum);
		return x;
         
		
		
	}	
	public static double computepi()  {
		double k = 4.0 *computnum() ;
        return k;
	}
}


	
	
         
    



        
