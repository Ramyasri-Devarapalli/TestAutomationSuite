package com.java.list;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
public class IteratingList {

	public static void main(String[] args) {
		//Iteration using List and for loop
		List<Double> numbers=Arrays.asList(2.4,5.0,9.7,5.4,0.3);
		for(double d=0;d<numbers.size();d++) {
			System.out.println(d);
		}
		//Iteration using ArrayList and Iterator
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Cherry");
		fruits.add("Papaya");
        Iterator itr=fruits.iterator();
        while(itr.hasNext()) {
        System.out.println(itr.next());
        }
		//Iteration using Linked list and forEach loop
		LinkedList<Integer> num= new LinkedList<Integer>();
		num.add(10);
		num.add(98);
		num.add(57);
		num.add(23);
		num.add(36);
		for(int number:num) {
			System.out.println(number);
		}
		
		//Iteration using List Iterator
		List<Character> letter=Arrays.asList('R','A','M','Y','A','S','R','I');
		ListIterator lhs = letter.listIterator();
		while(lhs.hasNext()) {
			System.out.println(lhs.next());

		}
		System.out.println(lhs.equals(lhs));
		System.out.println(lhs.hasPrevious());

		while(lhs.hasNext()) {
			lhs.remove();
		}
		System.out.println(lhs);
		
	}

}
