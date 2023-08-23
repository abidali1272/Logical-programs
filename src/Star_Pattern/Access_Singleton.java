package Star_Pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Access_Singleton  {
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		singleton first = singleton.singleobject();
		
		singleton second = singleton.singleobject();
		
		singleton third = (singleton) second.clone();
		
		System.out.println(first.hashCode());
		
		System.out.println(second.hashCode());
		
		System.out.println(third.hashCode());
		
		
		
		
	}

}
