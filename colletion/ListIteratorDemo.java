package com.psk.colletion;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	 public static void main(String[] args) {
	        
	        LinkedList<String> linkedList = new LinkedList<String>();
	        
	        linkedList.add("poonam");
	        linkedList.add("abhishek");
	        linkedList.add("bharat");
	        linkedList.add("shyam");
	        linkedList.add("akansha");
	        linkedList.add("satish");
	        linkedList.add("anjali");
	        linkedList.add("uma");
	        linkedList.add("lata");
	        
	        System.out.println(linkedList);
	        
	        ListIterator<String> listIterator = linkedList.listIterator();
	        
	        while(listIterator.hasNext()) {
	            
	            String str = listIterator.next();
	            
	            if(str.equals("abhishek")) {
	                listIterator.remove();
	            }
	            if(str.equals("uma")) {
	                listIterator.set("uma kushwah");
	            }
	            if(str.equals("akansha")) {
	                listIterator.add("akansha singh");
	            }
	        }
	        
	        System.out.println(linkedList);

	    }

}
