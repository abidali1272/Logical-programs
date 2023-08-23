package LogicalFeeReceieptSystem;

import java.util.LinkedList;
import java.util.Scanner;

interface Dao 
{
	
	void insert(Bean bean, Scanner sc, LinkedList<Bean> list);
	
	void update(Bean bean, Scanner sc, LinkedList<Bean> list);
	
	void generate_receipt(Bean bean, Scanner sc, LinkedList<Bean> list);
	
	void delete(Bean bean1, Scanner sc, LinkedList<Bean> list);
	

}
