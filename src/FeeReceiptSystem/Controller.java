package FeeReceiptSystem;

import java.util.Date;
import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		 AllDetail s1= new AllDetail();
		 
			System.out.println("Ricipt No :");
			s1.setReceiptno(src.nextInt());
			
			System.out.println("Student name :");
			s1.setStudentname(src.next());
			
			System.out.println();
			
			System.out.println("Mobile no :");
			s1.setMobileno(src.nextLong());
			
			Date date =new Date();
			s1.setDate(date);
			
			
			System.out.println("Enetr Course");
			s1.setCourse(src.next());
			

			if(s1.getCourse().equals("java")) {
			    s1.setCoursefee(30000);
			}
			
			else if(s1.getCourse().equals("c++")) {
				s1.setCoursefee(25000);

			}
			
			if(s1.getCourse().equals("java") || s1.getCourse().equals("c++") ) {
				
				System.out.println("Paid Fee :");
				s1.setPaidFee(src.nextFloat());
				
				}
				
				s1.setBalancefee(s1.getCoursefee()-s1.getPaidFee());
				
				
				if(s1.getPaidFee()<=s1.getCoursefee())
				{
					
				    System.out.println("  TECHSKILLS IT SOLUTION  ");
				    System.out.println("     FEE RECEIPT    ");
				    System.out.println("");
				    System.out.println("Recipt No      :"+s1.getReceiptno());
				    System.out.println("Student Name   :"+s1.getStudentname());
				    System.out.println("Mobile No      :"+s1.getMobileno());
				    Date outdate=s1.getDate();
				    System.out.println("current date:"+outdate);
				   
				    System.out.println("course         :"+s1.getCourse());
				    System.out.println("Course Fee     :"+s1.getCoursefee());
				    System.out.println("Paid Fee       :"+s1.getPaidFee());
				    System.out.println("Balance Fee    :"+s1.getBalancefee());
				}
				
				else {System.out.println("Try Again");}
			}
			
			
			
			
			
			
		 
		
		
	}


