package com.Service;

public interface Validation {
	String pattern="[1-9][0-9][0-9][0-9]";
	public static boolean valid(String name,String pattern)
	{
		return name.matches(pattern);
	}

}
