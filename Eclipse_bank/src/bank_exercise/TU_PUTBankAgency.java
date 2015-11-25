package bank_exercise;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TU_PUTBankAgency {

	PUTBankAgency pba;
	Bank b1, b2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		pba = new PUTBankAgency();
		b1 = new Bank();
		b2 = new Bank();
		Account ac1 = new Account(1, "Tomaz", new Date(), 2.5F, null, 0, 0.0F);
		Account ac2 = new Account(2, "Hugo", new Date(), 3.6F, null, 0, 0.0F);
		b1.accounts.add(ac1);
		b2.accounts.add(ac2);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTransfer() {
		pba.interBankTransfer(b1.accounts.get(0), b2.accounts.get(0),1.6F);
		assertTrue(b1.accounts.get(0).balance - 0.8F < 0.1F);
	}

}
