import java.util.*;

//4.1
public class Sphere {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("list 1");
		int size = scan.nextInt();
		System.out.println("list 1");
		int size2 = scan.nextInt();
		int list[] = new int[size];
		int list2[] = new int[size2];
		
		
		for ( int i = 0; i < list.length; i++) {
			Random rand = new Random();
			list[i] = rand.nextInt();
		}
		for ( int i = 0; i < list2.length; i++) {
			Random rand = new Random();
			list2[i] = rand.nextInt();
		}
		
		
		int[] merge = new int[list.length + list2.length];
		
		int c = 0;
		for (int i = 0; i < list.length; i++) {
			merge[i] = list[i];
			c++;
			
		}
		for (int j = 0; j < list2.length; j++) {
			merge[c++] = list2[j];
			c++;
		
		
		
	}
		for (int i = 0; i <merge.length; i++) {
			System.out.println(merge[i]);
		}

}
class S{
	

	private int doublek;

	public S(int doublek) {
		this.doublek = doublek;
		
		
	}
	public void setdoublek() {
		this.doublek = doublek;
		
		
		
	}
	public int getdoubleK() {
		return this.doublek;
		
		
	}
	public int area() {
		return (int) (4*Math.PI* Math.pow((doublek/2),2));
		
	}
	public String tostring() {
		return "the spthere has: ";
		
		
	}
} 