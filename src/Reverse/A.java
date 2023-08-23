package Reverse;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	
	
	public void countdublicate_no()
	{
		int count=0;
		
		int a[]= {10,20,30,40,30,10,20,60,70,10};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[i] + ":-" + count);
					
				}
				
			}
			
		}
		System.out.println(count);
	}
	
	public void Find_Dublicate_no(Scanner sc)
	{
		int a[]= {10,20,30,40,30,10,2060};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
			
			
		}
	}
	
	public void desilogic(Scanner sc)
	{
		System.out.println("Enter youre String");
		String next = sc.nextLine();
		
		char[] c = next.toCharArray();
		
		for(int i=c.length -1; i>=0; i--)
		{
			System.out.println(c[i]);
		}
		
			
	}
	
	public void sastalogic(Scanner sc)
	{
		System.out.println("Enter youre String");
		String s = sc.nextLine();
		
		StringBuffer buffer= new StringBuffer(s);
		StringBuffer reverse = buffer.reverse();
		
		System.out.println(reverse);
		
	}

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);	
	A a= new A();
	
	//a.desilogic(sc);
	
	//a.sastalogic(sc);
	
	//a.Find_Dublicate_no(sc);
	
	a.countdublicate_no();
	
	
		
		
	}

}
