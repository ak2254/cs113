
public class Arrays {
	public void initialze(int[][] array) {
		int i ; int j;
		for(i=0;i<5;i++)
	       {
	           for(j=0;j<5;j++)
	           {
	               if(i==j)
	               {
	                   array[i][j]=-1;
	                  
	               }
	               else
	               {
	                   array[i][j]=i+j;
	               }
	              
	           }
	       } 
	}
	public int[] totals(int[][] array) {
		int[] k = new int[array.length];
		for (int i = 0; i<= array.length-1; i++) {
			for(int j = 0; j<= array.length-1; j++) {
				k[i] = array[i][j];
				
		
		}
		
	}
		return k;

	}
	public int  alpha(String[] array) {
		int count = 0;
		int k [] = new int[array.length];
		
		for (int i =0; i < array.length; i++) {
			for (int j = 0; j<array[i].length(); j++) {
				if( array[i].charAt(j) == 'a'||array[i].charAt(j) == 'e'||array[i].charAt(j) == 'i'||array[i].charAt(j) == 'o'|| array[i].charAt(j) == 'u'  ) {
					count++;
					
				}
			}
			k[i] = count;
			count = 0;	
		}
		int max = 0;
		for(int i = 0; i <= k.length-1; i++) {
			if(k[i] > max ) {
				max = k[i];
				
			}
			
		}
		return max;
	}
	public int count(int[] array, int min) {
		int k =0;
		for(int i = 0; i <= array.length-1; i++) {
			if(array[i] > min) {
				k +=1;
				
			}
		}
		return k;
		
	}
	public void border(char[][] array) { 
		int size = array.length;
		for(int i = 0; i <= array.length-1; i++) {
			for (int j = 0; j <=array.length-1; j++) {
				if ( i==0 ||i==size-1 || j==0 ||j==size-1) {
					array[i][j] = 'o';
				}
				else {
					array[i][j] = 'x';
					
				}
			}
		}
		
	}
	
	
	
}


