package EmployeeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EMPIMP implements EMPmethod {

	public void insert(Scanner sc, Empbean bean, EMPIMP imp, ArrayList list) {
		System.out.println("How many data you want Enter");
		int number = sc.nextInt();
		
		//ArrayList list=new ArrayList();
		 

		for (int i = 1; i <= number; i++) {
		
			Empbean bean1=new Empbean();
			
			System.out.println("Enter" + " " + i + " " + "Data");
			System.out.println(" ");

			System.out.println("Employee id");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Employee name");
			String name = sc.nextLine();

			System.out.println("Enter Employee Address");
			String Adress = sc.nextLine();

			System.out.println();

			bean1.setId(id);
			bean1.setName(name);
			bean1.setAddress(Adress);

			list.add(bean1);
			
			System.out.println(list);

		}

		

	}
	


	public void show(Empbean bean, ArrayList list, Scanner sc) {
		System.out.println(" Would you like to View Data ");
		System.out.println("All data.1/ Individul person.2");

		int NO = sc.nextInt();

		if (NO == 1) {
			for (Object a1 : list) {
				Empbean eb = (Empbean) a1;

				System.out.println(eb);

			}

		}

		else if (NO == 2) 
		{
			for (Object a2 : list) 
			{
				Empbean eb = (Empbean) a2;
				
				System.out.println("Enter Id");
				int id = sc.nextInt();
				
				if(id==eb.getId())
				{
					System.out.println(eb.getName()+" "+eb.getAddress());
					break;
				}
				else 
				{
					System.out.println("Please Enter Valid Id");
					break;
				}
				
				
			}

		}

	}

	public void update(Scanner sc, ArrayList list) 
	{
		for (Object a3 : list) 
		{
			Empbean eb= (Empbean) a3;
			
			System.out.println("Enter Id you want to update");
			
			int id = sc.nextInt();
			
			if(id==eb.getId())
			{
				System.out.println("Enter name to update");
				sc.nextLine();
				
				String name = sc.next();
				eb.setName(name);
				
				System.out.println(eb);
				
				break;
				
			}
			
			
			
		}
		
		

	}
	


	public void delete(Scanner sc, ArrayList list) 
	{
	
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			Empbean	 next = (Empbean) iterator.next();
			
			System.out.println("Enter id you want delete");
			int id = sc.nextInt();
			
			if(id==next.getId())
			{
				list.remove(next);
			}
			else
			{
				System.out.println("Enter valid ID");
				
			}
			
			
			
		}
		
		System.out.println(list);

	}
	
	
	
	public void delete1(Scanner sc, ArrayList list)
	{
		for (Object a4 : list) 
		{
			Empbean	 emp=(Empbean) a4;
			
			System.out.println("Enter you id you want delete");
			int id = sc.nextInt();
			
			if(id==emp.getId())
			{
				list.remove(emp);
				
				System.out.println("delete success full");
				
				break;
			}
			else {
				System.out.println("Enter valid id");
			}
		}
		
	}

}
