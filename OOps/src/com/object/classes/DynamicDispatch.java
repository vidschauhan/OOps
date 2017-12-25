package com.object.classes;

public class DynamicDispatch {

	public static void main(String[] args) {
	
		A a = new A();
		B b = new B();
		C c = new C();
		
		A ref;
		ref = a;
		ref.show();
		

		ref = b;
		ref.show();
		

		ref = c;
		ref.show();
		
		
		
		A obja = new B();
		obja.show(); // will call B's show() because object type is of B;
		
		
		
		//B objb = new A(); // compile time exception;
		/*B objb = (B) new A();  // not valid. RUntime exception Classcast Exception.
		objb.show();*/
		
	}

}

class A {
	
	public void show() {
		System.out.println("A's method");
	}
}

class B extends A {
	
	public void show() {
		System.out.println("B's method");
	}
}


class C extends A {
	
	public void show() {
		System.out.println("C's method");
	}
}



