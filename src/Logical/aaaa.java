package Logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class aaaa {
	
	
	
	
	public static void main(String[] args) {
		

			int a[]= {10,20,30,40,50};
			
			int count=0;
			Scanner sc  = new Scanner(System.in);
			
			System.out.println("Enter element you want delete");
			int no = sc.nextInt();
			
			int[] a1= new int[4];
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==no)
				{
					
				}
				else
				{
					a1[count]=a[i];
					count++;
				}
				
					
			}
			
			System.out.println(Arrays.toString(a1));
	
	}
	
	

}
