package com.example.misc;

public class ObjectClass {

	public static void main(String[] args) {
		Object obj;  // object of Class object which sits on the top of all The classes.
		obj = 10;  // these type can be assigned with any type of java objects;
		System.out.println(obj);	
		obj = "Vidit";
		System.out.println(obj);
		System.out.println(obj.getClass().getName());
	}

}
