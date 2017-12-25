package com.object.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*Using newInstance()method of Constructor class:This is similar to the newInstance()method of a class.
There is one newInstance()method in the java.lang.reflect.Constructor class which we can use to create objects.
It can also call parameterized constructor, and private constructor by using this newInstance() method.
Both newInstance() methods are known as reflective ways to create objects. In fact newInstance() method of Class internally uses newInstance() method of Constructor class.
*/
public class ReflectionExample {

	private String name;

	ReflectionExample() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<ReflectionExample> constructor = ReflectionExample.class.getDeclaredConstructor();
    ReflectionExample r = constructor.newInstance();
    r.setName(" New Object Using newInstance() method of Constructor class");
    System.out.println(r.name);

	}

}
