package com.psk.colletion;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        // Preparing list of 0 to 10 elements
        
        for(int i=0;i<=10;i++) {
            arrayList.add(i);
        }
        
        System.out.println(arrayList);
        
        // getting the object of iterator 
        
        Iterator<Integer> itr = arrayList.iterator();
        
        while(itr.hasNext()) {
            
            Integer i = itr.next();
            
            if(i%2==0) {
                System.out.println(i);
            }else {
                itr.remove();
            }
        }
        System.out.println(arrayList);
    }

	}


