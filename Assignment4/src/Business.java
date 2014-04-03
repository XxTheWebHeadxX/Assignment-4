
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
	
	public setReceipt(String type, double total) {
		if (type.equals("drink") == true) {
				this.drinktotal += (this.drinktax * total) + total;
			}
		
		else if (type.equals("food") == true) {
			this.foodtotal += total;
		}
		else if(type.equals("other") == true) {
			this.rectotal += (this.othertax * total) + total;
		}
		else if(type.equals("occupancy") == true) {
			if(this.occupancyrate > 90) {
				this.rectotal += (this.occupancy * total) + total;
			}
		}
		
		else {
			this.rectotal += total;
		}
		
		
		}
}
public class Restaurant extends Business {
	double drinktax = .08;
	double foodtotal;
	double drinktotal;

	public Restaurant(int accnum) {
		super(accnum);
	}
	
	public Restaurant(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public totalReceipt() {
		if(this.foodtotal > this.drinktotal) {
			this.rectotal = (foodtotal + drinktotal)*.03;
		}
		
		else {
			this.rectotal = foodtotal + drinktotal;
		}
	}
}

public class Hotel extends Business {
	double occupancy = .02;
	int occupancyrate;
	
	public Hotel(int accnum) {
		super(accnum);
	}
	
	public Hotel(int accnum, double rectotal) {
		super(accnum, rectotal);
	}
	
	public setOccupancyRate(int ocrate) {
		this.occupancyrate = ocrate;
	}

}
public class Convenience extends Business {
	double newspapertax = 0.0;
	double othertax = .07;

	public Convenience(int accnum) {
		super(accnum);
	}
	
	public Convenience(int accnum, double rectotal) {
		super(accnum, rectotal);
	}

}