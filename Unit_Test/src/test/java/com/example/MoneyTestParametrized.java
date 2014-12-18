package com.example;

import static org.junit.Assert.assertEquals;
import junitparams.Parameters;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MoneyTestParametrized {
	
	public MoneyTestParametrized() {
		System.out.println("constructor ..");
	}
	
	private static final Object[] getMoney() {
		return new Object[] { new Object[] { 10, "USD" },
				new Object[] { 10, "EUR" } };
	}

	@Test
	@Parameters(method = "getMoney")
	public void checkConstructor(int amount, String currency) {
		Money money = new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}
	
	private static final Object[] getMoneyIllegal() {
		return new Object[] { new Object[] { -10, "USD" },
				new Object[] { 10, "" } };
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getMoneyIllegal")
	public void checkConstructorExceptions(int amount, String currency) {
		Money money = new Money(amount, currency);
	}
}
