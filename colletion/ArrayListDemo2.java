package com.psk.colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {

    List<String> list = new ArrayList<String>();
        
        list.add("Neha");
        list.add("Satish");
        list.add("Abhishek");
        list.add("Ravindra");
        list.add("Gourav");
        list.add("Neha");
        list.add(null);
        
        
        Iterator<String> itr = list.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
            
            for(String x : list) {
                System.out.println(x);
        }
	}

	}
	}
