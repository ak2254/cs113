public class main {

    public static void main(String[] args) {

        int n = args.length == 1 ? Integer.parseInt(args[0]) : 10;

        for (int i = 1; i <= n; ++i) {
            int[] arr = Pascal.triangle(i);
            System.out.print((i < 10 ? " " : "") + i + ": ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


class Pascal{
	public static int[] triangle(int n) {
		if(n ==1) {
			return new int[] {1};
						 
					}
		else if(n==2) {
					return new int[] {1,1};
				
			}	
		int [] preArray = triangle(n-1);
		int [] newA = new int[preArray.length +1];
		for( int i = 0; i<= newA.length-1; i++) {

			if(i == 0 || i ==newA.length-1 ){
				
				newA[i] =1;
				
			}
			else {
				newA[i] = preArray[i] + preArray[i-1];
			}
			
			}
		return newA;
   
	    }
	
	}

	





