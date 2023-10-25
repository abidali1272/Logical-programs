package Intervie_logical_qvation;

import java.util.Scanner;

public class prime_no {
	
	void Find_prime_no()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
		
		int nextInt = sc.nextInt();
		
		boolean check = false;
		
		for(int i=2; i<nextInt/2; i++)
		{
			if(nextInt% i==0)
			{
				check=true;
				break;
			}
		}
		
		if(!check)
		{
			System.out.println("this is prime no");
		}
		else
		{
			System.out.println("this is not a prime no");
		}
		
	}

	
	
	public static void main(String[] args) 
	{
		
		
		
	}

}
