
public class Student {
	private static int age;
	private static String sid;
	public void Student(int age, String sid) {
		this.age = age;
		this.sid = sid;
		
	}
	public void setage(){
		this.age = age;
		
	}
	public void setSid() {
		this.sid = sid;
	}
	public int getAge() {
		return age;
	}
	public String getSid() {
		return sid;
	}
	
	public boolean equals(Object o) {
		if( o == this) {
			return true;
		}
		else {
			return false;
		}
		
		}
	public Student findYoungest(Student ob)

    {

        if( this.age < ob.getAge() )

            return this;

        else

            return ob;

    }

}
	


