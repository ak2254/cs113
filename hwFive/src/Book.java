
public class Book {
	public String k;
	public  int num;
	public Book(String k, int num) {
		this.k = k;
		this.num = num;
		
	}
	
	public int getnum() {
		return num;
	}
	public void setK() {
		this.k =k;
		
	}
	public void setnum() {
		this.num= num;
	}
	public boolean equals(Book b){
		if(num == b.num && k.equals(b.k))
			return true;
		else
			return false;
		}

		public int compareTo(Book b){
			if(num < b.num)
				return -1;
			else if(num == b.num)
				return 0;
			else
				return 1;
		}
		public void setk() {
			this.k = k;
			
		}
		public String getk() {
			
			return k;
		}
}


