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

class Betaa extends A {
	//if Args constructor is present then one must provide default constructor manually;
	Betaa(){};
	int c;
	Betaa(int a,int b,int c){
		//Constructor Chaining.	
		super(a,b);
		this.c=c;
	}
	
	public void show() {
		/* super();  Super can't be call inside method. constructor call should be the first call in constructor.
*/		A a = new Betaa(2,4,6); /*If you have explicitly initialized constructor then the values will reflect local.*/
		System.out.println(a.b); /*here value of  a=2,b=4,c=6*/
	}
}

public class ThisInConstructor {

	public static void main(String[] args) {
		
		A a = new A();
		Betaa bb = new Betaa();
		bb.show();
	}

}
