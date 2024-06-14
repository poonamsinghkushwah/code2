package com.psk.colletion;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

	        
	        Vector<Integer> vector = new Vector<Integer>();
	        
	        for(int i=0;i<=30;i++) {
	            vector.addElement(i);
	        }
	        
	        System.out.println(vector);
	        
	        Enumeration<Integer> e = vector.elements();
	        
	        while(e.hasMoreElements()) {
	            
	            Integer i = e.nextElement();
	            
	            if(i%3==0) {
	                
	                System.out.println(i);
	                
	            }
	        }

	    }
	}


