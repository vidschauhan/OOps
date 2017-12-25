package com.example.misc;

public class InstanceInitializerBlock {

	public static void main(String[] args) {
		
		Derived1 d = new Derived1();

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
