import java.lang.reflect.Array;
import java.util.Arrays;

public class eStats {
	public static void main(String [] args) {
		
		String[] names =  { "monady", "tuesday" , "Wednesday", "thrusday", "friday" , "staturday", "sunday"};
		System.out.println(eStats.eStartistics(Arrays.toString(names)));
	}
	public static String eStartistics( String names) {
		String[] names1 = { "monady", "tuesday" , "Wednesday", "thrusday", "friday" , "staturday", "sunday"};
		int[] ans = new int[names1.length];
		char k  ='e';
		int count = 0;
		for( int i = 0; i< names1.length-1; i++) {
			for(int j = 0; j <names1[i].length()-1 ; j++) {
				if(names1[i].charAt(j) == 'e') {
					count++;
				}
			}
			ans[i] = count;
			count = 0;	
		}
		return Arrays.toString(ans);
		
		
	}
}
public class Rectangle
{
private double myWidth;

private double myLength ;


public Rectangle()
{



}
public Rectangle(double width, double length)
{
	this.myWidth = width;
	this.myLength = length;


}
public double getWidth()
{
	return myWidth;



}
public void setWidth(double width)
{
	this.myWidth = width;
}



public double computeArea()
{
	double area = this.myWidth * this.myLength;
	return area;
}



public double computePerimeter()
{
	double p = (this.myLength *2.0) + (this.myWidth*2);

}
}


