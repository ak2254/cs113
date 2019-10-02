import java.util.*;
public class mid1 {
	//1
	public static void main(String [] args) {
		String[] names ={"java", "python"};
		System.out.println(Arrays.toString(names));
		Scanner scan = new Scanner(System.in);
		System.out.println("plz enter the number: ");
		int cents = scan.nextInt();
		int qt = cents/25;
		int dimes = (cents%25)/10;
		int nickels = ((cents%25)%10)/5;
		int pennies = ((cents%25)%10)%5;
		System.out.println(qt + " " + dimes + " "+ nickels + " " + pennies + " ");
		
		
		// 2
		
		Scanner k = new Scanner(System.in);
		System.out.println("plz enter the number: ");
		Random rand = new Random();
		String z = k.nextLine();
		char x = z.charAt( (rand.nextInt((z.length())  )));
		char j = z.charAt( (rand.nextInt((z.length())  )));
		System.out.println(x);
		System.out.println(j);
		
		
		
		//ch2
		Scanner g = new Scanner(System.in);
		System.out.println("hur:" );
		int hr = g.nextInt();
		System.out.println("min:" );
		int min = g.nextInt();
		System.out.println("sec:" );
		int sec = g.nextInt();
		int sec1 = (hr * 60 *60) + (min * 60) + (sec);
		System.out.println(sec1);
		 
		
		//ch3.1
		Scanner w = new Scanner(System.in);
		System.out.println("fn:");
		String f = w.nextLine();
		System.out.println("ln:");
		String l  = w.nextLine();
		String iF = f.substring(0,1);
		String iL = l.substring(0,5);
		int num = rand.nextInt(89) +10;
		System.out.println(iF + iL + num);
		
		System.out.println(Math.pow(3, 2));
		
		}
	
	
	


	
	}
		
	

