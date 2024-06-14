package com.psk.instancecontlrolflow;

public class Student {
	 int rollNumber;
	 
	 String name;
	 
	 Student(int rollNumer, String name){
		 this.rollNumber=rollNumber;
		 this.name=name;
	 }
	 
	 
	 public static void main(String[] args) {
		 Student s1 = new Student(101, "poonam");
		 
		 System.out.println(s1.rollNumber);
		 System.out.println(s1.name);
	 }

}
