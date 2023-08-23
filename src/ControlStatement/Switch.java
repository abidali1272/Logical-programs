package ControlStatement;

import java.util.Scanner;

public class Switch {
	
	
	
	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter youre course");
		
		String ss=s1.nextLine();
		
		switch (ss) {
			
			case "java":
				System.out.println("its available");
				break;
				
			case "python":
				System.out.println("its availabe");
				break;
				
			case "c":
				System.out.println("its availabe");
				break;
				
				
				default :
					System.out.println("Its not available");
				
				
		}
		
		System.out.println();
		
		System.out.println("Enter youre Age");
		int age=s1.nextInt();
		
		switch (age) {
		case 12: 
			System.out.println("you are child ");
			break;
			
			case 13:
				System.out.println("you are child");
				break;
				
			case 14:
				System.out.println("you are child");
				break;
				
			case 15:
				System.out.println("you are adult");
				break;
		
			default:
				throw new IllegalArgumentException("Unexpected value: " + age);
		}
		
		
		
		
		
		
		
		
		
		
	
		}
	



	
		
	}

	
	


