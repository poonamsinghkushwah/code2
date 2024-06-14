package com.psk.colletion;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsClint {

	    public static void main(String[] args) {
	        
	        
	        ArrayList<Students>arraylist= new ArrayList<>();
	        
	        Students s1 = new Students(101,"poonam");
	        
	        Students s2= new Students(102,"ravindra");
	        
	        Students s3 = new Students(103,"komal");
	        
	        arraylist.add(s1);
	        arraylist.add(s2);
	        arraylist.add(s3);
	        
	        
	        
	        System.out.println(arraylist);
	        
	        Iterator<Students> itr = arraylist.iterator();
	        
	        while(itr.hasNext()) {
	            
	            
	            System.out.println(itr.next());
	            
	                    }
	    }
	    
}
