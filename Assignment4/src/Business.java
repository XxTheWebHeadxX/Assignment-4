
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
