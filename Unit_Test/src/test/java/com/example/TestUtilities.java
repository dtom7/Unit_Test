package com.example;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestUtilities {

	private static final Object[] getStringsToTest() {
		return new Object[] { new Object[] { "tset", "test" },
				new Object[] { "peep", "peep" },
				new Object[] { "80004", "40008" },
				new Object[] { "4c3b2a1", "1a2b3c4" } };
	}

	@Test
	@Parameters(method = "getStringsToTest")
	public void stringReverseTest(String expected, String actual) {
		assertEquals(expected, Utilities.reverse(actual));
	}

}
