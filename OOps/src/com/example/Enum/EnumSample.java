package com.example.Enum;

/* 

 *  #Enum declaration can be done outside a Class or inside a Class but not inside a Method. 
    #First line inside enum should be list of constants and then other things like methods, variables and constructor.
    
	#internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
}

*/
public class EnumSample {

	public static void main(String[] args) {

		//Color col = Color.BLACK;
		System.out.println(Color.BLACK);

	}

	enum Color {

		RED, GREEN, BLUE, BLACK
	}

}