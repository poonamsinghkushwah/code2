package com.psk.colletion;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	    public static void main(String[] args) {
	        
	        Vector<String> vector = new Vector<String>();
	        
	        vector.add("poonam");
	        vector.add(null);
	        vector.add("Shyam");
	        vector.add("Bharat");
	        vector.add("komal");
	        vector.add("Ram");
	        vector.add("Dipti");
	        
	        Enumeration<String> e = vector.elements();
	        
	        while(e.hasMoreElements()) {
	            
	            System.out.println(e.nextElement());
	        }
	        

	    }

	
}
