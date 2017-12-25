package com.NestedClass.example;


//A nested class has access to the members, including private members, of the class in which it is nested. 
//However, reverse is not true i.e. the enclosing class does not have access to the members of the nested class

/*Nested classes are divided into two categories:
1.static nested class : Nested classes that are declared static are called static nested classes.
2.inner class : An inner class is a non-static nested class.
*/
public class StaticNestedClass {

	public static void main(String[] args) {

		Alpha.Beta ab = new Alpha.Beta(); // Instantiating Inner Static class;
		ab.show();


	}

}


class Alpha {
	
	static int a = 10;
	private int b = 20;
	static private int c = 30;
	
	static class Beta {
		
		void show() {
			System.out.println("a :" + a);
			//System.out.println("b" + b); // can't call not static member of Aplpha. as static nested class cannot directly access non-static member.
			System.out.println("c :" + c);
		}
	}
}
