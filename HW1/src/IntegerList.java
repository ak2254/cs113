
import java.util. *;

class IntegerList {
	int list[];
	private int size;
	public IntegerList(int size, int list[]) {
		this.list = list;
		this.size  = size;
		
		
	}
	public void setSize() {
		this.size = size;	
		
	}
	public void setlist(){
		this.list = list;
		
	}
	public int getSize() {
		return this.size;
		
	}
	public int[] getList() {
		return this.list;
		
		
	}
	public int[] random() {
		Random rand = new Random();
		for (int i = 0; i <= size; i++ ) {
			list[i] = rand.nextInt(100) +1;
		}
		return list;
		
		
	}
	public String toString() {
		return (String)Arrays.toString(list);
		
	}
	public boolean equals() {
		if 
	}

}


//12

