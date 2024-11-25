package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatingLists {

	public static void main(String[] args) {

		List<String> a= Arrays.asList("a","b","c","d","e");
		List<String> b= Arrays.asList("p","q","r","s","t");
		List alternateConcat = new ArrayList();
		List concat=new ArrayList();
		
		//NORMAL CONCATINATION
		List<String> result=new ArrayList();
		result.addAll(a);
		result.addAll(b);
		System.out.println(result);
		
		//PROCEDURE ONE FOR ALTERNATIVELY CONCATING THE LISTS:-
		for(int j=0;j<a.size();j++) {
			if(a.get(j)!= null && b.get(j)!= null) {
				concat.add(a.get(j));
				concat.add(b.get(j));
			}
		}
		System.out.println(concat);

		//PROCEDURE TWO:-
		for(int i=0;i< a.size();i++)
		{
		    if(a.get(i) != null)
		    {
		    	alternateConcat.add(a.get(i));
		    	if(b.get(i) != null)
		    	{
		    		alternateConcat.add(b.get(i));
		    	}
		    }
		}
		System.out.println("Alternate Concat List : "+  alternateConcat);
	}
	

}
