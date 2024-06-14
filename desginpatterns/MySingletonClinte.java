package com.psk.desginpatterns;

public class MySingletonClinte {

	public static void main(String[] args) {

		MySingleton mySingleton1 = MySingleton.getInstance();
		
		System.out.println(mySingleton1.hashCode());
		
		MySingleton mySingleton2 = MySingleton.getInstance();
		
		System.out.println(mySingleton2.hashCode());
		
	}

}
