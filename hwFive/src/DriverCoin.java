//3

import java.util.Random;

public class DriverCoin {
	public static void main(String[] args) {
		int[] k = new int[25];
		int heads = 0;
		for(int i = 0; i<= k.length -1; i++) {
			Random rand = new Random();
			k[i] = rand.nextInt();
			Coin.flip();
			if(Coin.isHeads()) {
				heads +=1;
				
			}
			else {
				System.out.println("the coing is tails and has a monetary value of:" + k[i]);
				
			}
			
		}
	}

}
