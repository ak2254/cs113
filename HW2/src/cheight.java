import java.util.*;

public class cheight {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("please enter a number of n you want int the list from 0 to 50: ");
	
	int k = scan.nextInt();
	int[] g;
	while(true) {
		if (k<=50) {
			g = new int[k];
			break;
		}
		else{
			System.out.println("please enter a number of n you want int the list from 0 to 50: ");
			k = scan.nextInt();
	}
		
	}
	for(int i = 0; i <g.length; i++) {
		Random rand = new Random();
		int num = rand.nextInt();
		g[i] = num;
		
	}
	System.out.println(Arrays.toString(g));
	int s = 0;
	for (int i = 0; i < g.length; i++)
	{
	  s += g[i];
	  
	}
	double mean = s/ g.length;
	double smTotal = 0; 
	for (int i = 0; i < g.length; i++ ) {
		double sm = (g[i] - mean);
		smTotal += sm;
		
		
	}
	double std = Math.sqrt((Math.pow(smTotal, 2))/g.length);
	System.out.println("mean is:" + mean + "" + "standard deviation is : " + std );
	
	}

}




