package com.example.Enum;

/*Enum and Inheritance :

#All enums implicitly extend java.lang.Enum class. 
#As a class can only extend one parent in Java, so an enum cannot extend anything else.
toString() method is overridden in java.lang.Enum class,which returns enum constant name.
#enum can implement many interfaces.
*/

public class Enum_Methods {

	public static void main(String[] args) {
		Color arr[] = Color.values();
		 
        // enum with loop
        for (Color col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                             + col.ordinal());
        }
 
        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
	}

	
	enum Color
	{
	    RED, GREEN, BLUE;
	}
}



/*values(), ordinal() and valueOf() methods :
#These methods are present inside java.lang.Enum.
#values() method can be used to return all values present inside enum.
#Order is important in enums.By using ordinal() method, each enum constant index can be found, 
just like array index.
#valueOf() method returns the enum constant of the specified string value, if exists.
*/
