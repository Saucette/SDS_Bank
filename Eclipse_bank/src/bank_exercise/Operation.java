package bank_exercise;

import java.util.Date;

public abstract class Operation {
	
	String type = "";
	Date dateOfexecution;
	String description = "";

	public Operation() {
		
		this.dateOfexecution = new Date();
	}
	
}
