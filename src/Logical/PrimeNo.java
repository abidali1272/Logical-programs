package Logical;

import java.util.Arrays;

public class PrimeNo {
	
	public static void main(String[] args) {
		
	int	a[]= {10,30,90,20,60};
	
	System.out.println(	Arrays.toString(a));
	
	for(int i=0; i<a.length;i++)
	{
		Arrays.sort(a);
		System.out.println(a[i]);
	}
	
		
		int num=31;
		
		boolean flag=false;
		
		
		for (int i=2; i<num/2; i++)
		{
			if(num% i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println(num+" "+"is a prime no");
		}
		else
		{
			System.out.println(num+"is not a prime number");
		}
		
		
		
	}

}
