
public class SortedIntList extends IntList {
	public SortedIntList(int size) {
		super(size);
		   }
	public void add(int value) {
		if (numElements == list.length) {
			System.out.println("Can't add" );
				}
		else {
			Boolean k = false;
			for(int i=0;i<numElements;i++){
				if(value <=list[i]) {
					k = true;
					return;
					}
				if(k==false) {
					list[numElements] = value;
		           } 
		         else {
		        	   numElements++;
		       }
		   }
				}
				}
	public String toString() {
		return "Sorted Integer List;";
		   }
		}


