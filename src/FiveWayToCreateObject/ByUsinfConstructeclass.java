package FiveWayToCreateObject;

public class ByUsinfConstructeclass 
{
	
	String string="abid";
	
	public static void main(String[] args)  
	{
		
		try {
			Class class1 = Class.forName("FiveWayToCreateObject.ByUsinfConstructeclass");
			
			ByUsinfConstructeclass b1=	(ByUsinfConstructeclass) class1.newInstance();
			
			System.out.println(b1.string);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
