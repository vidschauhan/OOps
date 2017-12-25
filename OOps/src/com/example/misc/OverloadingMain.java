package com.example.misc;

// we can overload static methods as well, Example main();
// can't override static method because only instance methods can be overridden and static methods are not called with instance of the class.
public class OverloadingMain {

	static String str = "vidit";
	public static void main(String[] args) {

		main("Overloading Main()");
		main(10,20,str);
		
	}
	public static void main(String str) {
		
		System.out.println(str);
	}
	
	public static void main(int a, int b,String str) {
		
		System.out.println("a:" + a + " b :" + b + " name :" + str);
	}

}
