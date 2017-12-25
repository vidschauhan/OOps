package com.NestedClass.example;


//To instantiate an inner class, you must first instantiate the outer class
/*There are two special kinds of inner classes :
1.Local inner classes
2.Anonymous inner classes*/

public class InnerClass {

	public static void main(String[] args) {
		Outer outerobj = new Outer();
		outerobj.display();
		
		Outer.Inner innerObj = outerobj.new Inner(); // To access Local Inner class Method , Make first Outer class object. ten Instantiate using its object.
		innerObj.show();
		
		

	}

}


class Outer {
	
	private int a = 10;
	public static int b = 20;
	
	Inner in = new Inner();
	
	public void display() {
	
		System.out.println("ox" + in.ox); // can't be called directly. you have to make object of the inner class first to access its members;
		in.show(); //called using Inner class object.
	}
	
	// Inner class.
	class Inner {
		
		public int ox= 10;
		public void show()
		{
			System.out.println("a " + a); // Can be called directly.
			System.out.println("b " + b);
		}
	}
}