package com.This.example;


class A {
	
	int a,b;
	A(){
		
		this(10,20); // constructor call using this keyword.
		System.out.println("Inside no arg A's constructor!");
		System.out.println("a :" + a + " " + "b :" + b);
	}
	
	A(int a, int b){
		this.a = a;
		this.b=b;
	}
	
	public void show()
	{
		System.out.println("Inside Show()");
	}
}


public class ThisInConstructor {

	public static void main(String[] args) {
		
		A a = new A();
	}

}
