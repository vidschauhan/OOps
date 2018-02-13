package com.example.Enum;

import java.util.stream.Stream;

/*
 * Now to use this enum in code, there are some points we have to follow:-
We have to create parameterized constructor for this enum class. Why? 
Because as we know that enum class’s object can’t be create explicitly so for initializing 
we use parameterized constructor. 
And the constructor cannot be the public or projected it must have private or default modifiers. Why? 
if we create public or protected, it will allow initializing more than one objects. 
This is totally against enum concept.
We have to create one getter method to get the value of enums.
*/

public class CustomValEnum {
	
	public void print() {
		System.out.println("Enumsss : "+ Fruits.getEnumByString("Green"));
	}

	public static void main(String[] args) {
		
		System.out.println("Fruits :" + Fruits.ORANGE.getValue);
		
		//these lines can be written in JAVA 8 using lambdas.
		/*Fruits[] fr = Fruits.values();
		for (Fruits fruits : fr) {
			System.out.println("Fruit name : " + fruits.name() + " , " + "color  :" + fruits.getValue);
		}*/
		
		Stream.of(Fruits.values()).forEach(fruit -> System.out.println("Fruit name : " + fruit.name() + " , " + "color  :" + fruit.getValue));
		
		new CustomValEnum().print();
		
		
	}

	enum Fruits {
		
		APPLE("Red"),GUAVA("Green"),ORANGE("Orange"),BULEBERRY("Blue"),CHERRY("Red"),BANANA("Yellow");
		

	    // declaring private variable for getting values
		private String getValue;

		
		public String getGetValue() {
			return getValue;
		}

		 // enum constructor - cannot be public or protected
		// here creating private parameterized constructor for initializing values of the Enum constants;
		private Fruits(String getValue) {
			this.getValue = getValue;
		}
		
		public static String getEnumByString(String code) {
			return Stream.of(Fruits.values()).filter(x -> x.getValue.equalsIgnoreCase(code)).map(Fruits::name)
					.findAny().orElse("No Such Enum Exists!");
		}
	}
}
