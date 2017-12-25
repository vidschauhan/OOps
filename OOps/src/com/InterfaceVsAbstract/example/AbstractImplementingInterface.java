package com.InterfaceVsAbstract.example;

public class AbstractImplementingInterface {

	public static void main(String[] args) {
		
		PC pc = new PC();
		pc.Dell();
		pc.Desktop();
		pc.ThinkPad();
		
	}

}

//Remember, interface members can only be public..
interface Lappy{
	//By default it is public whether you give it or not.
	void ThinkPad();
	void Dell();
}


abstract class Model implements Lappy{

	public void Desktop() {
		System.out.println("Inside Desktop.");
	}
}


class PC extends Model{

	//You have to give it public access as child class can’t assign the weaker access to the methods
	@Override
	public void ThinkPad() {
		System.out.println("Implementation of Thinkpad method!");
		
	}

	@Override
	public void Dell() {
	
		System.out.println("Implementation of Dell method!");
		
	}
	
}
