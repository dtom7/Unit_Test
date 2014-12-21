package com.example;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class HamCrestTest {
	
	@Test
	public void testMatchers() {
		int age = 30;
		assertThat(age, is(equalTo(30)));
		assertThat(age, is(30));
		assertThat(age, not(equalTo(33)));
		assertThat(age, is(not(33)));
	}

}
