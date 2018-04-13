package com.Java8Interface.example;

public interface Ax {
	public default void show() {
		System.out.println("Ax");
	}
	public void display();
}
