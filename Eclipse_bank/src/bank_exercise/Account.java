package bank_exercise;

import java.util.Date;

public class Account {

	Integer id;
	String owner;
	Date dateOfOpening;
	Float balance;
	History history;
	Integer limit;
	Float interestRate;
	String bankId;
	
	public Account() {
	
	}
	
	public Account(Integer id, String owner, Date dateOfOpening, Float balance, History history, Integer limit,
			Float interestRate) {
		super();
		this.id = id;
		this.owner = owner;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
		this.history = history;
		this.limit = limit;
		this.interestRate = interestRate;
	}
	
	public boolean pay(Float amount){
		
		// rate checking
		if(balance-amount>=limit){
			
			balance-=amount;
			
			return true;
		}
		
		return false;
	}
	
	public void receive(Float amount){
		
		balance+=amount;
		
	}
	
	public boolean debit(int limit){
		
		if (limit>balance) return false;
		this.limit = limit;
		return true;
	}

}
