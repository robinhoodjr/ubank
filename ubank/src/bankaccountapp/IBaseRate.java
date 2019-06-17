package bankaccountapp;

public interface IBaseRate {
	
	// Write a method to that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}
	
	
	
}
