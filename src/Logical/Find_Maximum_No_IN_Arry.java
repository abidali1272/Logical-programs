package Logical;

public class Find_Maximum_No_IN_Arry {
	
	public static 	void findmaximum_no()
	{
		int a[]= {10,20,30,40,6};
		
		int max=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		
	}
	
	public static void minimumno()
	{
		int a[]={10,20,30,5,8,};
		
		int min=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
	
	public static void find_Max_Withpoiutthirdvariable()
	{
		int a[]= {10,20,30,50,90,9};
		
		int max=a[0];
			
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<=a[j])
				{
					max=a[i];
				}
			}
		}
		System.out.println(max);
		
	}
	
	public static void sortarr()
	{
		int a[]= {10,50,80,40};
		
		int max=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) 
	{
		//minimumno();
		
		//find_Max_Withpoiutthirdvariable();
		
		//sortarr();
		
		
		
		
	}

}
