package com.droptable.utils;

public class NamePatternBuilder {

	public static String makeLikePattern(String input) { 
		String pattern = input.trim().toUpperCase();
		pattern = pattern.replaceAll("[\\s]", "%");
		pattern = pattern.replaceAll("^", "'%");
		pattern = pattern.replaceAll("$", "%'");
		return pattern;
	}
}