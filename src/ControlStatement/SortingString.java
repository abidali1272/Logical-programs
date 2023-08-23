package ControlStatement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SortingString {
	
	public static void main(String[] args) {
		
	
		HashSet ss= new HashSet();
		
	
		
		String s="abcauyc";
		char[] charArray = s.toCharArray();
		
	
		
		for (char string : charArray) 
		{
			ss.add(string);
			
		}
		
		
		System.out.println(ss);
		
	}

}
