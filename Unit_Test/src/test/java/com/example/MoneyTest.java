package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MoneyTest 
{
 
	@Test
	public void checkConstructor() {
		Money money = new Money(10, "USD");
		assertEquals(10, money.getAmount());
		assertEquals("USD", money.getCurrency());
		
	}
}
