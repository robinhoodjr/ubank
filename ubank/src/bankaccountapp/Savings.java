package bankaccountapp;

public class Savings extends Account {
	
	// List properties specific to a Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize settings for Savings account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		this.safetyDepositBoxKey =(int) (Math.random() * Math.pow(10, 4));
	}
	
	
	
	// List any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Saving Account Features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}
	
}
