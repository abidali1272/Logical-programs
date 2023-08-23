package FiveWayToCreateObject;

public class byusingnewinstancemethod 
{
	String string="java";
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		
		Class<?> class1 = Class.forName("FiveWayToCreateObject.byusingnewinstancemethod");
		
		byusingnewinstancemethod b1 = (byusingnewinstancemethod) class1.newInstance();
		
		System.out.println(b1.string);
		
		
		
	}

}
