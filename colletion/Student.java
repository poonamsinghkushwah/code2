package com.psk.colletion;

public class Student {
	
	int id;
	
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public int getld() {
		return id;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	   @Override
	    public String toString() {
	        return "Student [id=" + id + ", name=" + name + "]";	

}
}