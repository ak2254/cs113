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


//2

public class MonetaryCoin extends Coin{
	int k;
	public MonetaryCoin(int k) {
		super();
		this.k = k;
	}
	public int getK() {
		return k;
	}
	public void setK() {
		this.k = k;
		
	}
	public String toString(){

		return "Value : "+getK();
		}
}



//1

import java.util.*;
public class BookL {
	public static int Max = 10;
	public static int ci = 0;
	static Scanner scan = new Scanner(System.in);;
	public static void main(String[] args) {
		Book[] b = new Book[Max];
		
	}
	public static void addbook(Book[] b) {
		if(ci ==Max) {
			System.out.println("error");
		}
		else{
			System.out.println("enter the title: ");
			String t = scan.nextLine();
			for(int i = 0; i<= ci-1; i++) {
				if(b[i].getk() == t) {
					System.out.println("error: the title already exist");
					return;
				}
			}
		System.out.println("enter the number of pages: ");
		int k = scan.nextInt();
		b[ci]= new Book(t, k);
			
		}	
	
	}
	public static void deleteBook(Book[] b) {
		if(ci==0) {
			System.out.println("error");
		}
		else {
			
			System.out.println("enter the title of the book");
			
			String k = scan.nextLine();
			for(int i =0; i<= Max-1; i++) {
				if(b[i].getk() !=k) {
					System.out.println("Error");
					return;
				}
			}
		}
	}
	public static void changeBook(Book[] b)
	{
		if(ci==0) {
			System.out.println("error: it's empty");
		}
		else {
			System.out.println("enter the book title");
			String k = scan.nextLine();
			for (int i = 0; i<= Max-1; i++) {
				if(b[i].getk() == k) {
					continue;
				}
				else {
					System.out.println("book does not exist");
					System.out.println("enter the book title");
					 k = scan.nextLine();
					
				}
			}	
				}
		return;
			}
	}
	


