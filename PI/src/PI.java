import java.util.Random;
import java.util.Scanner;

public class PI {
	
	public static void Main(String[] args) {
		
			
			
		}
class constroctor{
	int repeats = 1000;
																																																																																			
	double areaUS = 1;
	double areaC = Math.PI * Math.pow(0.5, 2);
	private double x;
	private double y;
	
	public constroctor(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public con distance(constroctor o) {
		double distance = Math.sqrt( (((o.x +.5) * (o.x+ .5) ) + ((o.y + .5)*(o.y +.5))));
		if( distance >= .5){
			return true;
		}
	
	
	public  double computnum(constroctor o) {
		int num = 0;
		for (int i = 1; i >= repeats; i++) {
			Random rand = new Random();
			o.x = rand.nextDouble();
			Random k = new Random();	
			o.y = rand.nextDouble();	
			if (distance(o)) {
				num +=1;
			}
			return  num; 	
		}
	}
	public constroctor computePI(constroctor o) {
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
		
		
		
	
		}
	