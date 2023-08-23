package EmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public interface EMPmethod {
	
	public void insert(Scanner sc, Empbean bean, EMPIMP imp, ArrayList list);
	
	public void show(Empbean bean, ArrayList list, Scanner sc);
	
	public void update(Scanner sc, ArrayList list);
	
	public void delete(Scanner sc, ArrayList list);
	
	
	

}
