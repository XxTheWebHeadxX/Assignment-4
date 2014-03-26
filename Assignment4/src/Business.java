
abstract class Business {
	protected int accnum = 0;
	protected double rectotal = 0;
	protected double taxes = 0;

	
	public Business(int accnum) {
		this.accnum = accnum;
		
	}
	
	public Business(int accnum, double rectotal) {
		this.accnum = accnum;
		this.rectotal = rectotal;
	}
}


public class Restaurant extends Business{

	public Restaurant(int accnum) {
		super(accnum);
	}
	
	public Restaurant(int accnum, double rectotal) {
		super(accnum, rectotal);
	}

}
