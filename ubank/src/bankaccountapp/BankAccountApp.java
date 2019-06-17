package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<>();
		
//		Checking chkacc1 = new Checking("Roby Rai","123123123", 1500);
//		Savings savacc1 = new Savings("Moby Dick", "321321321", 2500);
//		chkacc1.showInfo();
//		System.out.println("=============================");
//		savacc1.compound();
//		savacc1.showInfo();
//		savacc1.deposit(5000);
//		savacc1.withdraw(200);
//		savacc1.transfer("Brokerage", 3000);
		
		// Read a CSV file then create new accounts based on that data
		String file = "NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder: newAccountHolders) {
//			System.out.println("New Account");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
//			System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);
			if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE"); 
			}
		}
		
		for (Account acc : accounts) {
			System.out.println("\n=================");
			acc.showInfo();
		}
		
		System.out.println("-----------------");
		accounts.get((int) Math.random() * accounts.size()).deposit(1000);
		System.out.println("-----------------");
		accounts.get((int) Math.random() * accounts.size()).withdraw(100);
		

	}

}
