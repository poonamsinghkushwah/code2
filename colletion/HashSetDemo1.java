package com.psk.colletion;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	    public static void main(String[] args) {
	        
	        HashSet<String> hashSet = new HashSet<String>();
	        
	        hashSet.add("Pooja");
	        hashSet.add("Bharat");
	        hashSet.add("Lata");
	        hashSet.add("Amit");
	        hashSet.add("Abhishek");
	        hashSet.add("Akansha");
	        hashSet.add("Uma");
	        hashSet.add("Komal");
	        hashSet.add("null");
	        hashSet.add(null);
	        
	        Iterator<String> itr = hashSet.iterator();
	        
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        
	    }



}
