import java.util.Random;
import java.util.Scanner;

public class H {
	public static  void main(String [] args) {
	//5.3
		Scanner scan = new Scanner(System.in);
		System.out.println("number of tie you want to do it");
		int num= scan.nextInt();
		
		System.out.println("enter the year");
		
		int k = scan.nextInt();
		for(int i = 0; i <= k; i++ ) {
			if(k%4 ==0 || ( k%100==0  && k%400 !=400)){
				System.out.println("it is the leap year");
			}
			else {
				System.out.println("not a leap year");
				
			}
			if(k< 1582) {
				System.out.print("error");
			}	
		}
		
		
	//5.4
		Random rand = new Random();
		int j = rand.nextInt(100) +1;
		int guess;
		for(int i = 0; i!=j; i++) {
			System.out.println("guess the number");
			guess = scan.nextInt();
			if( guess > j) {
				System.out.print("it is greater than the number");
				i++;
				continue;	
			}
			else if( guess < j) {
				System.out.print("it is greater than the number");
				i++;
				continue;	
				
			}
			else {
				System.out.println(guess);
				System.out.println(i);
				
		}
			
		
			
		}

		int total = 0;
		for( int i = 1; i <= 100; i++) {
			if(i%3== 0 || i%5 ==0){
				total +=i;
				
				
			}
		}
		System.out.print(total);

}
}

