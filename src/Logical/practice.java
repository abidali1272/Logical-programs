package Logical;

import java.util.Scanner;

public class practice {
	
	
	public static  void fabonaci(int no)
	{
		int f1, f2=0,f3=1;
		
		 for(int i=0; i<=no; i++)
		 {
			 System.out.println(f3);
			 
			 f1=f2;
			 f2=f3;
			 f3=f1+f2;
		 }
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enetr no");
		
		int n=s1.nextInt();
		
		if(n>0)
		{
			fabonaci(n);
		}
		else
		{
			System.out.println("Enter positive no");
		}
		
		
	}

}
