package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeDetectorTest {
	
	@Test
	public void testPalindromeDetector() {
		assertFalse(PalindromeDetector.detect(10));
		assertFalse(PalindromeDetector.detect(123));
		assertFalse(PalindromeDetector.detect(1000));
		assertTrue(PalindromeDetector.detect(1));
		assertTrue(PalindromeDetector.detect(22));
		assertTrue(PalindromeDetector.detect(101));
		assertTrue(PalindromeDetector.detect(7227));
		assertTrue(PalindromeDetector.detect(15351));
	}

}
