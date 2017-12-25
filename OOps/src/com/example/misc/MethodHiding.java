package com.example.misc;

public class MethodHiding {

	public static void main(String[] args) {

		XYZ.show(); // Prints show() of XYZ.
		// ABC.show(); // Even This will print show() of XYZ

		XYZ xyz = new XYZ();
		xyz.show(); // will call Static show() of  XYZ class;
	}

}

class ABC {

	ABC() {
		System.out.println("Inside ABC constructor!");
	}

	static void show() {
		System.out.println("Show() in abc");
	}

	void display() {
		System.out.println("Inside Display of ABC");
	}
}

class XYZ extends ABC {

	XYZ() {
		System.out.println("Inside XYZ constructor!");
	}

	static void show() {

		System.out.println("Show() in xyz");
	}

	void display() {
		System.out.println("Inside Display of XYZ");
	}
}
