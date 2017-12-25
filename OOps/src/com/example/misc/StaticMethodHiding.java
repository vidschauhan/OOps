package com.example.misc;

public class StaticMethodHiding {

	public static void main(String[] args) {
	
		A a = new B();
		a.show(); // Will print Show() of Class A.  // By the way its illegal to call a static method using objects.
		//If we make both A.fun() and B.fun() as non-static then the above program would print “B.fun()”.
 
	}

}


class A {
	
public static void show() {
		System.out.println("Inside A's Show()");
	}
}

class B extends A{
	
	public static void show() {
		System.out.println("Inside B's Show()");
		
	}
}