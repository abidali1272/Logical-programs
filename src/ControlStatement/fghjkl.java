package ControlStatement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class fghjkl {
	
	public static void main(String[] args) 
	{
		HashMap<String,Integer> s1= new HashMap<String,Integer>();
		
		String a="weteteui";

		String[] split = a.split("");
		
		
		
		for (String string : split) 
		{
			if(s1.containsKey(string))
			{
				s1.put(string, s1.get(split)+1);
			}
			else
			{
				s1.put(string, 1);
			}
			
		}
		
		for ( Entry<String, Integer> pp:s1.entrySet()) 
		{
			System.out.println("key" +pp.getKey());
			System.out.println("value"+ pp.getValue());
			
		}
		
		
		

		
		
	}
	
	
	
	

}
