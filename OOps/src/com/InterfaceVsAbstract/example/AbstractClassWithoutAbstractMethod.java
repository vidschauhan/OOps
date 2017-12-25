package com.InterfaceVsAbstract.example;

public class AbstractClassWithoutAbstractMethod {

	public static void main(String[] args) {
		
		Lenovo lv = new Lenovo();
		lv.display();
	}

}

//we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited.
///Abstract classes can also have final methods (methods that cannot be overridden). For example, the following program compiles and runs fine.

abstract class Laptop {

	Laptop(){
		System.out.println("Inside Laptop's constructor");
		
	}
	
	final void display() {
		System.out.println("Display method of Laptop");
	}
	
}

class Lenovo extends Laptop {
	
	Lenovo(){
		System.out.println("Inside Lenovo's constructor");
	}
	
	/*void display() {
		System.out.println("Display method of Lenovo");
	}*/
}
