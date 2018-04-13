package com.example.misc;

/*Java 5.0 onwards it is possible to have different return type for a overriding method in child class, 
but child�s return type should be sub-type of parent�s return type. 
Overriding method becomes variant with respect to return type.*/

public class CovariantReturn {

	public static void main(String[] args) {
		
		 Base base = new Base();
	       base.fun();
	
	       Derived derived = new Derived();
	       derived.fun();
	       
	       System.out.println(base);
	}

}


class A1 {}
class B1 extends A1 {}
 
class Base
{
    A1 fun()
    {
        System.out.println("Base fun()");
        return new A1();
    }
}
 
class Derived extends Base
{
    B1 fun()
    {
        System.out.println("Derived fun()");
        return new B1();
    }
}
