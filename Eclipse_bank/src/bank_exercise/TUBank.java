package bank_exercise;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.PortableInterceptor.HOLDING;

import bank_exercise.Account;
import bank_exercise.Bank;

public class TUBank {

	Bank bank;
	Account ac1;
	Account ac2;
	Float am;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		bank = new Bank();
		ac1 = new Account(1, "Tomaz", new Date(), 2.5F, null, 0, 0.0F);
		ac2 = new Account(2, "Hugo", new Date(), 3.6F, null, 0, 0.0F);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTransfer() {
		
		assertTrue(bank.transfer(ac2, ac1, 1.8F));
		assertEquals(1.8F,ac2.balance, 0.1);
		assertEquals(4.3F,ac1.balance, 0.1);
	}
	
	@Test
	public void testNewDeposit1() {
		
		assertNull(bank.openDeposit(ac1, 5.9F, new Date(2015, 12, 31), 6.9F));
		assertEquals(0, bank.history.getHistoryAL().size());
	}
	
	@Test
	public void testNullDeposit() {
		
		assertNull(bank.openDeposit(ac1, 0.0F, new Date(2015, 12, 31), 6.9F));
		assertEquals(0, bank.history.getHistoryAL().size());

	}
	
	@Test
	public void testNewDeposit2() {
		
		assertTrue(bank.openDeposit(ac1, 2.5F, new Date(2015, 12, 31), 6.9F) instanceof Deposit);
		assertEquals(1, bank.history.getHistoryAL().size());

	}
	//////////
	@Test
	public void testNullLoan() {
		
		assertNull(bank.openLoan(ac1, 0.0F, new Date(2015, 12, 31), 6.9F));
		assertEquals(0, bank.history.getHistoryAL().size());
	}
	
	@Test
	public void testNewLoan() {
		
		assertTrue(bank.openLoan(ac1, 2.5F, new Date(2015, 12, 31), 6.9F) instanceof Loan);
		assertEquals(1, bank.history.getHistoryAL().size());

	}
	////////
	
}
