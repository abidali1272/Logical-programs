package Singleton;
  
public class Singleton_class {
	
	private static Singleton_class single;
	
	private String s;
	
	private Singleton_class()
	{
		 s = "Hello I am a string part of Singleton class";
	}
	
		public static Singleton_class getinstance()
		{
			
			if( single==null)
			
				single= new  Singleton_class();
				
				return single;
			
			
		}
	

	


}
