package com.example.Enum;

/*We can declare main() method inside enum. 
Hence we can invoke enum directly from the Command Prompt.
*/
enum Enum_In_Main {
	RED, GREEN, BLUE;
	public static void main(String[] args) {
		System.out.println(Enum_In_Main.BLUE);
	}
	
	Enum_In_Main(){
		System.out.println("Inside Enum's constructor");
	}

}
