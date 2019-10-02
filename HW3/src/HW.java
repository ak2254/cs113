import java.util.Arrays;
import java.util.Scanner;

public class HW {
	public  static void main(String [] args) {
		int [] g = new int[100];
		for (int i = 0; i <= g.length -1; i++) {
			g[i] = i+1;
		}
		
		for (int i = 1; i <= g.length-1; i++){
			boolean prime = false;
			for (int j = 2; j< g[i]; j++)
			{
				int num = g[i]%j;
				if(num ==0) {
					prime = true;
					g[i] =0;
				}
				
				}
				
			}
		System.out.println(Arrays.toString(g));
			
			}
}
		
					
				
				

	
		
		
	





