package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		//Sorting list using normal sort() method
		List<Integer> num = Arrays.asList(38,99,20,65,22,54);
		System.out.println("Array before sorting: "+num);
		num.sort(null);//It's a Natural sorting method
		System.out.println("Array after sorting using sort method: "+num);
		
		//Sorting using Collections.sort() by Comparator interface
		ArrayList<Double> d=new ArrayList<Double>(); //Arrays.asList(1.8,0.7,6.3,4.7,9.2,0.1);
		d.add(1.8);
		d.add(0.7);
		d.add(6.3);
		d.add(4.7);
		d.add(9.2);
		d.add(0.1);
		d.set(5,0.1);
		System.out.println("Before sort"+d);
		Collections.sort(d);
		System.out.println("After Sorting using collections.sort(): " + d);
		
		//Sorting using Bubble sort 
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		list.add(100);
		list.add(250);
		list.add(180);
		list.add(360);
		list.add(420);
		System.out.println("before sorting : " +list);
		bubbleSort(list);
		System.out.println("After sorting: " +list);
		
		
}
	 public static void bubbleSort(LinkedList<Integer> list) {
	        int n = list.size();
	        boolean swapped;
	        
	        // Bubble Sort
	        do {
	            swapped = false;
	            for (int i = 0; i < n - 1; i++) {
	                if (list.get(i) > list.get(i + 1)) {
	                    // Swap the elements
	                    Integer temp = list.get(i);
	                    list.set(i, list.get(i + 1));
	                    list.set(i + 1, temp);
	                    swapped = true;
	                }
	            }
	            n--; // Decrease n because the last element is already sorted
	        } while (swapped);
	    }
	}
