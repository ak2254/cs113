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
