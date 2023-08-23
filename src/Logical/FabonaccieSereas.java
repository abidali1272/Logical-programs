package Logical;

import java.util.Scanner;

public class FabonaccieSereas {
	
	public static  void showfabonaccie(int no)
	{
		int f1,f2=0,f3=1;
		
		for(int i=1; i<=no; i++)
		{
			System.out.println(f3);
			
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}
	
		public static void main(String[] args) {
			
			Scanner s1= new Scanner(System.in);
			
			System.out.println("Enter A no");
			
			int n=s1.nextInt();
			
			if(n>0)
			{
				showfabonaccie(n);
			}
			else
			{
				System.out.println("Pleas enter positive no");
			}
			
			
		}

}
