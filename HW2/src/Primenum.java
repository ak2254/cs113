import java.util.*;


public class Primenum {	
	public static void seive(int [] array) {
		for ( int i = 0; i <= array.length -1; i++) {
			array[i] = i+1;
		}
		boolean[] k = new boolean[array.length+1];
		for( int i = 2; i < array.length; i++) {
			if(i <= array.length) {
				k[i] = false;
			}
		}
		int root = (int) Math.sqrt(k.length);
		for(int i = 2; i <= root; i++ ) {
			if( k[i] == false) {
				int num = i*2 ;
				while(num <= array.length) {
					k[num] = true;
					num += i;
			}	
		}
		}
		for(int i = 2; i <=array.length; i++) {
			if(k[i] == false) {
				System.out.println(i);
			}
		}	
		}
	
	public static void goldbach(int[] array) {
		
		for ( int i = 0; i <= array.length -1; i++) {
			array[i] = i+1;
		}
		for(int i = 0; i<array.length; i++) {
			if((array[i] &1) !=0 && array[i] >=4 ) {
				System.out.println(i);

			}
		for(int i1 = 0; i1<= array.length -1; i1++) {
			
				
			}
			
		}
	}
	public static void main(String [] args) {
		int[] k = new int[100];
		
		goldbach( k);
		seive(k);
		
			
		
		
		
		
			 
				
				
			}
	
		}
		

	
	

	
	
		


	



	
