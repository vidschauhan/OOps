package com.Java8Interface.example;

class DefaultImplJava8 implements Bx,Ax {

	@Override
	public void show() {
	Bx.super.show();
	}
	public static void main(String[] args) {
		
		Bx obj = new DefaultImplJava8();
		DefaultImplJava8 ob = new DefaultImplJava8();
		obj.show();
		ob.display();
	}
	@Override
	public void display() {
		System.out.println("A");
		
	}

}
