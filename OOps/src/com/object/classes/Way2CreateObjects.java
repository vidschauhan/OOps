package com.object.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Way2CreateObjects {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {

		// Using new() keyword
		Test test = new Test();

		// Using newInstance() method of Class class
		NewInstance newInst = NewInstance.class.newInstance();

		NewInstance newInst1 = (NewInstance) NewInstance.class.forName("com.object.classes.NewInstance").newInstance();

		// Using newInstance() method of Constructor class // runtime error
		Constructor<ABC> constructor = ABC.class.getDeclaredConstructor();
		ABC abc = constructor.newInstance(args);

		// Using clone() method
		CloneTest cst = new CloneTest();

		CloneTest ct = (CloneTest) cst.clone();

		Test t1; //only declared, no memory is allocated. new() is used to allocate memory. In java Objects are always allocated Heap Memory.
	}

}

class Test {

	Test() {
		System.out.println("Inside Test Class Constructor!");
	}

}

class NewInstance {

	NewInstance() {
		System.out.println("Inside NewInstance Class Constructor!");
	}

}

class ABC {

	ABC() {

		System.out.println("Inside ABC's constructor!");
	}
}

// To use clone() method on an object we need to implement Cloneable and define
// the clone() method in it

class CloneTest implements Cloneable {

	CloneTest() {
		System.out.println("Inside CloneTest Constructor!");
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

}
class Real {
	
	int x,y;
	
	Real(){
		x=10;
		y=20;
	}
}

/*
 * Difference between Class.newInstance() and Constructor.newInstance() By name,
 * both methods look same but there are differences between them which we are as
 * following Class.newInstance() can only invoke the no-arg constructor
 * Constructor.newInstance() can invoke any constructor, regardless of the
 * number of parameters. Class.newInstance() requires that the constructor
 * should be visible Constructor.newInstance() can also invoke private
 * constructors under certain circumstances. Class.newInstance() throws any
 * exception (checked or unchecked) thrown by the constructor.
 * Constructor.newInstance() always wraps the thrown exception with an
 * InvocationTargetException.
 */