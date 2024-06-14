package com.psk.colletion;

import java.util.ArrayList;

public class ArayListDemo1 {
    
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        
        arrayList.add("poonam");
        arrayList.add("Abhishek");
        arrayList.add("Satish");
        arrayList.add("Neha");
        arrayList.add("Gourav");
        arrayList.add("Neha");
        arrayList.add(null);
        arrayList.add(10);
        arrayList.add(20);
       arrayList.add(30);
        
        System.out.println(arrayList.size());
        
        System.out.println(arrayList);
    }
}
