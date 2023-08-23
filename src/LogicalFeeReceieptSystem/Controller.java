package LogicalFeeReceieptSystem;

import java.util.LinkedList;
import java.util.Scanner;

public class Controller 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		DaoImpl imp= new DaoImpl();
		
		Bean bean1= new Bean();
		
		LinkedList<Bean> list=new LinkedList<Bean>();
		
		System.out.println("  * TACHSKILL IT SOLUTION *");
		System.out.println("    ------FEE RESIPT ------");
		System.out.println();
		System.out.println("     Create New Receipt");
		
		imp.insert(bean1,sc,list);
		
		
	}

}
