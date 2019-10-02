import java.util.*;
public class Student {
	public static void main(String[] args) {
		k a = new k(15, "anjalik12");
		System.out.println( "the student" + a.toString(a.getage()) );
		
	}

}
class k{
	private int age;
	private String sid;
	public k(int age, String sid) {
		this.age = age;
		this.sid = sid;
	}
	public void setage() {
		this.age = age;
		
	}
	public int getage() {
		return this.age;
		
	}
	public String toString(k o) {
		return "the person has: " + o.age;
		
	}
	
	
}
