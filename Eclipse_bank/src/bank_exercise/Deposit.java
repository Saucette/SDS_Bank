package bank_exercise;

import java.util.Date;
import bank_exercise.Account;

public class Deposit {
	
	Account account;
	Float amount;
	Date opening;
	Date closing;	
	Float rate;
	
	public Deposit(Account account, Float amount, Date closing, Float rate) {
		
		this.account = account;
		this.amount = amount;
		this.opening = new Date();
		this.closing = closing;
		this.rate = rate;
	}

	void withdrawal(Date date){
		
		if(date.before(closing)) rate = 0.0F;
		
		account.receive(amount);
		
	}
	
}
