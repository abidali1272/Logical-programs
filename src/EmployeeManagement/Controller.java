package EmployeeManagement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
	
	
	
	public static void main(String[] args) {
		
		
		Empbean bean= new Empbean();
		
		EMPIMP  imp= new EMPIMP();
		
		ArrayList list= new ArrayList();
		
		LinkedList linked= new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome TO EMPLOYEE Data");
		System.out.println();
		
		imp.insert(sc,bean,imp,list);
		
		//imp.show(bean,list,sc);
		
		//imp.update(sc,list);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		imp.delete(sc,list);
		
	//	imp.delete1(sc,list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
