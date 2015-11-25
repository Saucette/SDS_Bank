package bank_exercise;

import java.util.Date;

public class Loan {

	Account account;
	Float amount;
	Date opening;
	Date closing;	
	Float rate;
	
	public Loan(Account account, Float amount, Date closing, Float rate) {
		
		this.account = account;
		this.amount = amount;
		this.opening = new Date();
		this.closing = closing;
		this.rate = rate;
	}
	
}
