package PAtternlogical;

public class khan
{
	int a= m1();
	
	

	
	static int m1()
	{
		{System.out.println("instance");}
	
		return 23;
	}
	
	static{System.out.println("static");}

	   public static void main(String[] args) {
		   
		   khan s1= new khan();
		   s1.m1();
		
		   
	}
	
	
}  


