package com.psk.colletion;

import java.util.Iterator;
import java.util.LinkedList;

	public class LinkedListDemo1 {

	    public static void main(String[] args) {
	        
	        LinkedList linkedList = new LinkedList<String>();
	        
	        linkedList.add("Satish");
	        linkedList.add("Alok");
	        linkedList.add("poonam");
	        linkedList.add("abhishek");
	        linkedList.add("pooja");
	        linkedList.add("Shailendra");
	        linkedList.add("Rahul");
	        linkedList.add("Neha");
	        linkedList.add("Neha");
	        linkedList.add(null);
	        
	        Iterator<String> itr = linkedList.iterator();
	        
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	    }
		
	}
	
