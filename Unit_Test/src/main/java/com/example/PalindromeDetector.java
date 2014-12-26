package com.example;

public class PalindromeDetector {
	
	public static boolean detect(int number) {
		
		return Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
	}

}
