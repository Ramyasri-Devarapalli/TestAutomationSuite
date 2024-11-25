package com.java.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class InsertAccessDeleteSet {

	public static void main(String[] args) {

		Set<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(1);
		set1.add(6);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println(set1);
		System.out.println(set1.size());
		set1.add(8);
		System.out.println(set1);
		set1.remove(1);
		System.out.println(set1);
		
		HashSet<Character> set2 = new HashSet<Character>();
		set2.add('D');
		set2.add('e');
	}

}
