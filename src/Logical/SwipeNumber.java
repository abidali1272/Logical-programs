package Logical;

public class SwipeNumber {
	
	int a=10;
	 int b=20;
	 
	 
	 
	 
	 void m1()
	 {
		 System.out.println(a); 
		 System.out.println(b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println();
	 System.out.println(a); 
	 System.out.println(b);
	 
	 }
	
	
	public static void main(String[] args) {
		
		SwipeNumber s1=new SwipeNumber();
		s1.m1();
		
		
		
		
		
	}

}
