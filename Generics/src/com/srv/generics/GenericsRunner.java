package com.srv.generics;

import com.srv.generics.MyCustomList;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		list.addElement("Element 3");
		String value = list.get(0);
		
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(6));
		Integer number = list2.get(0);
		
		System.out.println(number);
		
	}

}
