package Reverse;

import java.util.Scanner;

public class ReverseNO {
	
	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter youre no");
		int no = s1.nextInt();
		
		int reverseno=0;
		
		while(no!=0)
		{
			reverseno=reverseno*10+no%10;
			
			no=no/10;
		}
		
		System.out.println("Reverse no is"+" "+reverseno);
		
	}

}
