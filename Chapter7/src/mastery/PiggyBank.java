package mastery;

public class PiggyBank {
	
	//create variables
	private int pen;
	private int nic;
	private int dime;
	private int quart;
	
	//constructor method
	public PiggyBank() {
		pen = 0;
		nic = 0;
		dime = 0;
		quart= 0;
	}
	
	//adds whatever number is set in mysavings to pen
	public void penny (int num) {
		pen += num;
	}
	
	//adds whatever number is set in mysavings to nic
	public void nickel (int num) {
		nic += num;
	}
	
	//adds whatever number is set in mysavings to dime
	public void dime (int num) {
		dime += num;
	}
	
	//adds whatever number is set in mysavings to quart
	public void quarter (int num) {
		quart += num;
	}
	
	//turns pen nic and dime into their monetary values and adds them all together for the total amount in the bank
	public double bankTotal () {
		return (pen * 0.01) + (nic * 0.05) + (dime * 0.1) + (quart * 0.25);
	}
	
	//resets pen nic dime and quart to 0 to represent taking out money from the bank
	public void takeOut( ) {
		pen = 0;
		nic = 0;
		dime = 0;
		quart= 0;
	}
}

