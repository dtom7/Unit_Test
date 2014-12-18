package com.example;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class TestHashMap {
	
	private HashMap<String, String> hashMap;
	
	@Before
	public void testHashMapBefore() {
		hashMap = new HashMap<String, String>();
	}
	
	@Test
	public void testHashMapPutGet() {
		hashMap.put("test","test");
		assertEquals("test", hashMap.get("test"));
	}
	
	@Test
	public void testHashMapReplace() {
		hashMap.put("test","test1");
		hashMap.put("test","test2");
		assertEquals("test2", hashMap.get("test"));
	}
	
	@Test
	public void testHashMapClear() {
		hashMap.put("test1","test1");
		hashMap.put("test2","test2");
		assertEquals(2, hashMap.size());
		hashMap.clear();
		assertEquals(0, hashMap.size());
	}
	
	@Test
	public void testHashMapNullKey() {
		hashMap.put(null, "null");
		assertEquals("null", hashMap.get(null));
	}
	
	@Test(expected = NullPointerException.class)
	public void testHashMapNullPointerException() {
		hashMap.get(null).length();
	}

}
