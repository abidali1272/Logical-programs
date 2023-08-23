package SimpleCrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlller {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);

		
		Dao s3= new Dao();
		
		bean s2= new bean();
		
		System.out.println("Enetr youre Age");
		s2.setAge(sc.nextInt());
		
		System.out.println("Enter youre name");
		s2.setName(sc1.next());
		
		System.out.println("Enter youre hotel");
		List<Integer> list= new ArrayList<>();
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		s2.setHotel(list);
		s3.save(s2);
		
		System.out.println("delete youre age");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
