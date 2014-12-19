package com.example;

import static org.mockito.Mockito.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarMock {
	
	private Car myCar = mock(Car.class);
	
	@Test
	public void testCarInstance() {
		assertTrue(myCar instanceof Car);
		assertEquals(0.0, myCar.getEngineTemperature(), 0.0);
		when(myCar.getEngineTemperature()).thenReturn(2.0);
		assertEquals(2.0, myCar.getEngineTemperature(), 0.0);
	}
	
	@Test(expected = NullPointerException.class)
	public void testCarException() {
		when(myCar.getEngineTemperature()).thenThrow(new NullPointerException());
		myCar.getEngineTemperature();
	}

}
