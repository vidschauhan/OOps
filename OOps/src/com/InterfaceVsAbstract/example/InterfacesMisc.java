package com.InterfaceVsAbstract.example;

interface Test {

    // public, static and final
    final int a = 10;
 
    // public and abstract 
    
	/*public static void show() {
		System.out.println("a");
	}*/  // method body can be given in Interface in java 8.
}


class Implclass implements Test {

	public void show() {
		System.out.println("Inside Show Method()");
	}
	
}




public class InterfacesMisc {

	public static void main(String[] args) {

	Implclass ipc = new Implclass();
	ipc.show();
	//Test.show();
	System.out.println(ipc.a); // we can call 'a' using object of Test class.
	System.out.println(Test.a); // Since 'a' is declared in Interface so by default it is public static final. and it can be called using Test.a;
	}

}
