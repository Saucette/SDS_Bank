package bank_exercise;

import java.util.Date;
import java.util.Hashtable;

public class History {

	private Hashtable<Date, String> historyAL;
	
	public History() {

		historyAL = new Hashtable<>();
	}
	
	public void add(Date date, String info){
		
		historyAL.put(date, info);
	}

	public Hashtable<Date, String> getHistoryAL() {
		return historyAL;
	}

	public void setHistoryAL(Hashtable<Date, String> historyAL) {
		this.historyAL = historyAL;
	}
	
	public String getInputAtDate(Date date)
	{
		return this.historyAL.get(date);
	}
	
	
}
