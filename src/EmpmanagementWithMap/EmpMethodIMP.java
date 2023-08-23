package EmpmanagementWithMap;

import java.util.Map;
import java.util.Scanner;

public class EmpMethodIMP implements  EmpMethod{

	public void insert(Scanner sc, Map<Integer, Empbean> map, Empbean bean) 
	{
		System.out.println("How many data yoou want enter:-- ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++)
		{
			Empbean	bean1= new Empbean();
			
			System.out.println("Enter youre"+i+" "+"data");
			System.out.println();
			
			System.out.println("Enetr Employee ID");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enetr youre Employee name");
			String name = sc.next();
			sc.nextLine();
			
			System.out.println("Enetr youre Employee gmail");
			String gmail = sc.next();
			sc.nextLine();
			
			bean1.setId(id);
			bean1.setName(name);
			bean1.setGmail(gmail);
			
			map.put(bean1.getId(), bean1);	
			
		}
		
		System.out.println(map);
		
		
	}

	@SuppressWarnings("unlikely-arg-type")
	public void show(Scanner sc, Map<Integer, Empbean> map, Empbean bean1) 
	{
		System.out.println("you want to see all data press 1 and see single data preess one ");
		int no = sc.nextInt();
		
		if(no==1)
		{
			System.out.println(map);
			
		}
		else if(no==2)
		{
			for (Integer data : map.keySet()) 
			{
				Empbean empbean = map.get(data);
				
				System.out.println(empbean.getName()+" "+empbean.getGmail());
				
			}
			
			
		}
		else 
		{
			System.out.println("invalid data");
		}
		
	}

	public void update() 
	{
		
		
	}

	public void delete(Scanner sc, Map<Integer, Empbean> map) 
	{
		System.out.println("Enter id you want to delete");
		
		int id = sc.nextInt();
		
		System.out.println();
		
		map.remove(id);
		
		System.out.println(map);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
