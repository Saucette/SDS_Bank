package bank_exercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bank_exercise.Account;

public class TUAccount {

	Account ac;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
		ac = new Account();
		
		ac.balance = 2.2F;
		ac.limit = 0;
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testPay1() {
		
			assertFalse(ac.pay(2.3F));
			assertEquals(ac.balance, 2.2, 0.1);
	}
	
	@Test
	public void testPay2() {
		
			assertTrue(ac.pay(1.9F));
			assertEquals(ac.balance, 0.3, 0.1);
	}
	
	@Test
	public void testPay3() {
		
			assertTrue(ac.pay(2.2F));
			assertEquals(ac.balance, 0.0, 0.1);
	}
	
}
