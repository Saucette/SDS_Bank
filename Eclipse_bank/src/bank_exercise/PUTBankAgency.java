package bank_exercise;


public class PUTBankAgency {
	
	
	boolean interBankTransfer(Account a1, Account a2, Float am) {
		
		// test banks
		
		if(am<=0.0F) return false;
		
		if(!a1.pay(am))
			
			return false;
				
		a2.receive(am);
		
		return true;
	}
	
}
