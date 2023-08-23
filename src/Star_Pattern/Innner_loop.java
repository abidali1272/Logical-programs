package Star_Pattern;

public class Innner_loop 
{
	
	
	public static void main(String[] args) 
	{
		
		for(int i=0; i<6; i++)
		{
			
			for(int j=1; j<5; j++)
			{
				System.out.print("*");
			}
		
			System.out.println();
			
		}
		
		
		
	int a[][]= new int[4][4];
	
	
	for(int i=0; i<5; i++)
	{
		for(int j=0; j<4; j++)
		{
			
			a[i][j]=i+j;
			System.out.print(a[i][j]);
			
		}
		
		System.out.println();
		 
	}
	
	
		
		
		
	}

}
