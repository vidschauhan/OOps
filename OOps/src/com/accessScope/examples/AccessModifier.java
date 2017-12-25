package com.accessScope.examples;


// Tips to remember :
//Private intance variables neither be called directly in main() nor inherited.
// if there is not any access modifier then by default "default" modifier is applied on every method class or instance variables,
// instance veriable needs to be static if it has been used in static method.
//Classes or interface can not be declared as private

// The methods or data members declared as protected are accessible within same package or sub classes in different package.

public class AccessModifier {

	static int x = 10 ;
	int var = 20;
	
	public static void main(String[] args) {

		//System.out.println("var :" + var);  // compile time error, since var is not declared as static.
		System.out.println("X :" + x);
	}

}
