package Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Integer [] a= {1,2,3,4,5};
		
		Integer [] b= {6,7,8,9,10};
		
		Integer [] c= {11,22,33,44,55};
		
		Integer [] d= {111,222,333,444,555};
		List<Integer> a1 = Arrays.asList(a);
		List<Integer> a2 = Arrays.asList(b);
		List<Integer> a3= Arrays.asList(c);
		List<Integer> a4 = Arrays.asList(d);
		
	//	Object[]ob= {a1,a2,a3,a4};
		ArrayList s1 =new ArrayList();
		s1.add(a1);
		s1.add(a2);
	
		
		

		ArrayList s3 =new ArrayList();
		s3.add(a3);
		s3.add(a4);
		
		
		LinkedList s2 =new LinkedList();
		s2.add(s1);
		s2.add(s3);
		
		System.out.println(s2);
		
		
		
	}

	@Override
	public String toString() {
		return "ReverseString [getClass()=" + getClass()  + ", toString()="
				+ super.toString() + "]";
	}
}
		


