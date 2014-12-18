package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationsInJunit {
	
	@BeforeClass
	public static void checkBeforeClass() {
		System.out.println("@BeforeClass");
	}
	
	
	@Before
	public void checkBefore() {
		System.out.println("@Before");		
	}
	
	@Test
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
	}
	
	
	@After
	public void checkAfter() {
		System.out.println("@After");
	}
	
	@AfterClass
	public static void checkAfterClass() {
		System.out.println("@AfterClass");
	}

}
