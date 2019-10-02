import java.util.Scanner;

public class UnitConverter {
	public static void main(String[] args) {
		
		
//problem 2.5 		
		double foot, inches;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the inches value to convert in feet:" + " ");
		inches = Scan.nextDouble();
		foot = inches/ 12.0;
		System.out.println(foot);
		
//problem 2.6
		
		double Pound , Gram;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the  value to convert in pound:" + " ");
		Gram = k.nextDouble();
		Pound = Gram/ 453.592;
		System.out.println(Pound);
//problem 2.8
		int kilogram, gram, milligrams, answer;
		Scanner kg = new Scanner(System.in);
		System.out.println("kilograms value:");
		kilogram = kg.nextInt();
		
		Scanner g = new Scanner(System.in);
		System.out.println("grams value: ");
		gram = g.nextInt();
		
		Scanner mg = new Scanner(System.in);
		System.out.println("milligrams value: ");
		milligrams = mg.nextInt();
		
		answer = (kilogram * 1000000) + (gram * 1000 ) + milligrams;
		System.out.println(answer);
//problem 2.9
		int mgs, kgs, gs, userInput;
		Scanner read = new Scanner(System.in);
		System.out.println("milligrams value: ");
		userInput = read.nextInt();
		kgs = userInput/1000000;	
		gs = (userInput %1000000)/1000;
		mgs = (userInput %1000000)%1000;
		System.out.println("kilogram: " + kgs + " grams: " + gs + " milligrams: " + mgs);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
