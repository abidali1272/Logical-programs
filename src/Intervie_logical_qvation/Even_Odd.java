package Intervie_logical_qvation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Even_Odd {
	
	void even_odd()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		for(int i=0; i<=number; i++)
		{
			if(number%2==0)
			{
				System.out.println(number+"  is evevn");
				break;
			}
			else
			{
				System.out.println(number+"  is odd");
				break;
			}
		}
	}
		
	void list_sorting()
	{
		Map<Integer, Integer> map= new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(2);
		
		Collections.sort(list);
		System.out.println(list);
	}

	void Fibonacci_Sereas()
	{
		 int n1=0,n2=1,n3,i,count=30;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
	}
	
	public static void main(String[] args) 
	{
		
		Even_Odd eo= new Even_Odd();
		//eo.Fibonacci_Sereas();
		
		while(true)
		{

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the No");
			int name = sc.nextInt();
			
			if(name/2==0)
			{
				System.out.println("This is Even Number"+name);
			}
			else
			{
				System.out.println("This is odd Number"+name);
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
	}

}
