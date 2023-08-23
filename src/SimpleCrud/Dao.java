package SimpleCrud;

import java.util.List;

public class Dao {
	
	bean save(bean bean1) {
	
		int age = bean1.getAge();
		String name = bean1.getName();
		List<Integer> hotel = bean1.getHotel();
		
		System.out.println(age);
		System.out.println(name);	
		System.out.println(hotel);
		
		return bean1;
		}
	
	
			int delete ()
				{
					
				return  1;
				}
	
	
}
