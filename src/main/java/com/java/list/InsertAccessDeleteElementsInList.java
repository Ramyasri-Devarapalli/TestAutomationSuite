package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAccessDeleteElementsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Ramya","Dimbu","Vidya","Jashu","Tilak","Sai");
		System.out.println(names);
		
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("Ramya");
		names2.add("Dimbu");
		names2.add("Vidya");
		names2.add("Jashu");
		names2.add("Tilak");
		names2.add("Sai");
		System.out.println(names2);
		System.out.println(names2.get(0));
		System.out.println(names2.contains("Sai"));
		System.out.println(names2.add("Pranay"));
		System.out.println(names2);
		System.out.println(names2.get(1).equals("Vidya"));
		System.out.println(names2.get(3).endsWith("u"));
		
		names2.remove("Ramya");
        System.out.println("Names list after removing 'Ramya': " + names2);
        //Arrays.asList(...) creates a fixed-size list backed by the original array. This means that the size of the list cannot be changed—no elements can be added or removed. 
        //If you attempt to call remove() on this list, you will get an UnsupportedOperationException.
        //ArrayList is a resizable array implementation of the List interface. You can freely add, remove, and modify elements without restrictions.

	}
}


