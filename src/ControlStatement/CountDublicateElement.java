package ControlStatement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountDublicateElement 
{
	
	
	public static void main(String[] args) 
	{
		
		Map<Character,Integer> map= new HashMap <Character,Integer>();
		
		String s="abcbdfcc";
		
		char[] charArray = s.toCharArray();
		
		for (char c : charArray) 
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
			
		}
	
		
		Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Character, Integer> next = iterator.next();
		
			if(next.getValue() > 1)
			{
				System.out.println(next.getKey());
				System.out.println(next.getValue());
			}
			
			
		}
		
		
		
	}

}
