package com.psk.colletion;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<String>();
        
        treeSet.add("a");
        treeSet.add("e");
        treeSet.add("i");
        treeSet.add("o");
        treeSet.add("u");
        
        
    //    System.out.println(treeSet);
        
        Iterator<String> itr = treeSet.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
