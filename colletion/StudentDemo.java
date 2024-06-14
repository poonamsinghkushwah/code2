package com.psk.colletion;

import java.util.Objects;

public class StudentDemo {
	 private int id;
	    
	    private String name;

	    public StudentDemo(int id, String name) {
	        super();
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Student other = (Student) obj;
	        return id == other.id && Objects.equals(name, other.getname());
	    }

	    @Override
	    public String toString() {
	        return "Student [id=" + id + ", name=" + name + "]";
	    }

}
