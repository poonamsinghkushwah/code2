package com.psk.colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {
	    
        List<Employee> list = new  ArrayList<Employee>();
        
        Employee employee1 = new Employee(101,"Neha");
        Employee employee2 = new Employee(102,"komal");
        Employee employee3 = new Employee(103,"lucky");
        Employee employee4 = new Employee(104,"kuttu");
        
        list.add( employee1);
        list.add( employee2);
        list.add( employee3);
        list.add( employee4);
        
        //System.out.println("Iterate using iterator;");
        Iterator itr = list. iterator();
        
        System.out.println("Iterate using for each:");
        for (Employee s:list) {
            System.out.println(s);
        }
     
    }
}
