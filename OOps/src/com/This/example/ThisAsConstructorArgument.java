package com.This.example;

public class ThisAsConstructorArgument {
	
	public static void main(String args[]) {
		
		B b = new B();
	}

}


class Z {
	
	B b;
	
	Z(B b){
		
		System.out.println("Inside Z's constructor!");
		this.b = b;
		b.display();
	}
}


class B {
	
	int x= 10;
	B(){
		
		Z z = new Z(this); // passing "this" as constructor call.
	}
	
	public void display() {
		
		System.out.println("X :" + x);
	}
	
}
