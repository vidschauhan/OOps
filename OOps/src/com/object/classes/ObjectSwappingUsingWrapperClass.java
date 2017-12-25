package com.object.classes;

class Student {

	private String name;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSection() {
		return section;
	}

	private int id;
	public void print() {
		System.out.println("Student [name=" + name + ", id=" + id + ", section=" + section + "]");
	}

	private int section;

	Student() {
		System.out.println("Inside Student class default constructor");
	}

	public Student(String name, int id, int section) {
		this.name = name;
		this.id = id;
		this.section = section;

		
	}
}

class StudentWrapper{
	Student s;
	StudentWrapper(Student s){
		this.s = s;
	}
	
}
public class ObjectSwappingUsingWrapperClass {
	
	public static void swap(StudentWrapper sw1,StudentWrapper sw2) {
		Student tmp;
		tmp=sw1.s;
		sw1.s=sw2.s;
		sw2.s=tmp;
	}
	

	public static void main(String[] args) {

		Student st1 = new Student("Vidt",1,2001);
		Student st2 = new Student("Amit",2,5005);
		StudentWrapper sw1 = new StudentWrapper(st1);
		StudentWrapper sw2 = new StudentWrapper(st2);
		swap(sw1,sw2);
		
		sw1.s.print();
		sw2.s.print();
		
	}

}
