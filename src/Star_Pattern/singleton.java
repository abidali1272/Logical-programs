package Star_Pattern;

final class singleton  implements Cloneable{
	
	public static singleton single;
	
	
	
	private singleton()
	{
		
	}
	
	static singleton singleobject()
	{
		if(single==null)
		{
			return single=new singleton();
		}
		
		return single;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		if(single==null)
		{
			return super.clone();
		}
		
		return single;
		
		
	}
}
