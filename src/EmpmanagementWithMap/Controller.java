package EmpmanagementWithMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
	
	
	public static void main(String[] args) {
		
		Empbean bean= new Empbean();
		
		EmpMethodIMP methods= new EmpMethodIMP();
		
		Map<Integer, Empbean> map= new HashMap<>();
		
		Scanner sc= new Scanner(System.in);
	
		
		System.out.println("\nWelcome to Employee management:------- ");
		System.out.println();
		
		methods.insert(sc,map,bean);
		
		methods.show(sc,map,bean);
		
		
		
		
		
		//methods.delete(sc,map);
		
		
		
	}

}
