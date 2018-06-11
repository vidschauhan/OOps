package com.example.misc;

public class InstanceInitializerBlock {

	public static void main(String[] args) {
		
		Derived1 d = new Derived1(); // New Object of Derived.
		System.out.println(d.toString()); 
		d = new Derived1(); // New Object of derived with different memory reference.
		System.out.println(d.toString());

	}

}

class Base1 {

	{
		System.out.println("Inside Base Initializer Block.");
	}

	Base1() {
		System.out.println("Base constructor!");
	}
}

class Derived1 extends Base1 {

	{
		
		System.out.println("Inside Derived Initializer Block.");
	}

	Derived1() {
		super();
		System.out.println("Derived constructor!");
	}

}
