package Intervie_logical_qvation;

import java.util.Scanner;

public class String_Reverse {
	
	void String_Reverse()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter youre name");
		String name = sc.nextLine();
		
		
		char[] s1 = name.toCharArray();
		
		for(int i=s1.length-1;       i>=0;            i--)
		{
			System.out.println(s1[i]);
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
	}

}
