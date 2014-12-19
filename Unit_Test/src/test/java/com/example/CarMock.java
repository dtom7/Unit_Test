package com.example;

import static org.mockito.Mockito.*;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CarMock {
	
	private Car myCar = mock(Car.class);
	
	@Test
	public void testCarInstance() {
		assertTrue(myCar instanceof Car);
		
	}

}
