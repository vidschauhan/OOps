package com.InterfaceVsAbstract.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		Student st2 = new Student(3, "Rahul", "New Delhi");
		Student st = new Student(1, "Vidit", "Mahipalpur");
		Student st3 = new Student(4, "Ram", "Gurgaon");
		Student st1 = new Student(2, "Amit", "Calcutta");
		
		
		list.add(st1);
		list.add(st2);
		list.add(st);
		list.add(st3);
		
		System.out.println("Unsorted List Elements!");
		for (Student student : list) {
			
			System.out.println(student.toString());
		}
		
		Collections.sort(list,new SortByRoll());
		
		System.out.println("Sorted By roll number.");
		for (Student student : list) {
			System.out.println(student.toString());
		}
		
		Collections.sort(list,new SortByName());
		System.out.println("Sorted By Name.");
		for (Student student : list) {
			System.out.println(student.toString());
		}
		
	}

}

class Student
{
    int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}


class SortByRoll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.rollno - o2.rollno;
	}
	
	
}

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student name1, Student name2) {
		// TODO Auto-generated method stub
		return name1.name.compareTo(name2.name);
	}
	
}
