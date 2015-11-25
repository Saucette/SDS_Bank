package bank_exercise;

import java.util.ArrayList;
import java.util.Date;

public class Bank {

	History history;
	ArrayList<Account> accounts;
	
	public Bank() {

		history = new History();
		accounts = new ArrayList<>();
		
	}
	
	public boolean transfer(Account ac1, Account ac2, Float am){
		
		if(am<=0.0F) return false;
		
		if(!ac1.pay(am))
			
			return false;
				
		ac2.receive(am);
		
		history.add(new Date(), "Transfer : " +ac1.id+" -- "+ac2.id+" -- "+am);

		return true;
		
	}
	
	public Deposit openDeposit(Account account, Float amount, Date closing, Float rate){
		
		if((amount<=0.0F)  || !account.pay(amount)) return null;
				
		history.add(new Date(), "Open Deposit : " +account.id+" -- "+closing+" -- "+amount+ " -- "+rate);
		
		return new Deposit(account, amount, closing, rate);
		
	}
	
	public Loan openLoan(Account account, Float amount, Date closing, Float rate){
		
		if(amount<=0.0F) return null;
		
		account.receive(amount);
		
		history.add(new Date(), "Open Loan : " +account.id+" -- "+closing+" -- "+amount+ " -- "+rate);

		return new Loan(account, amount, closing, rate);
		
	}
	
}
