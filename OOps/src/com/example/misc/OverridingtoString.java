package com.example.misc;

public class OverridingtoString {

	public static void main(String[] args) {

		classToStringOverride obj = new classToStringOverride(10, 11);

		System.out.println(obj);
	}

}

class classToStringOverride {
	int x;
	int y;

	classToStringOverride(int x, int y) {

		this.x = x;
		this.y = y;

	}

	
	// Overriding toString method with our own implementation.
	@Override
	public String toString() {

		return String.format("Value of X " + x + " " + "Value of Y " + y);
	}

}
