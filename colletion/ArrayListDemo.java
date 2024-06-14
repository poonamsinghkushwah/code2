package com.psk.colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		  List<String> list = new ArrayList<String>();
	        
	        list.add("poonam");
	        list.add("meghsing");
	        list.add("abhishek");
	        list.add("Neha");
	        list.add("Gourav");
	        list.add("Neha");
	        list.add(null);
	        
	        Iterator<String> itr = list.iterator();
	        
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	}

}
