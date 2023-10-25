package Ejaz_bhai_task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class read_csv_file {
	
	public static List<String> getfirstdata() throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\khan abid\\Desktop\\Ejaz_Bhai_Task\\task.csv");
      	 
		 int a;
		List<String> list= new ArrayList<>();
		
		while((a=file.read())!=-1)
		{
			char c=(char) a;
			String string = Character.toString(c);
			
			list.add(string);
			
		}
		
		return list;
	}
	
	public static void main(String[] args) throws IOException 
	{
		List<String> getfirstdata = getfirstdata();

			Iterator<String> iterator = getfirstdata.iterator();
			while (iterator.hasNext()) {
				String string = iterator.next();
				if(string.equals("PNR")) {
					iterator.remove();
				}
				System.out.println(string);
			}
		//System.out.println(getfirstdata);
			
//		List<String> b=new ArrayList<>();
//		for (String string : getfirstdata) 
//		{
//			
//			if(string.equals("PNR"))
//			{
//				string.replace("PNR", "");
//			}
//			else
//			{
//				b.add(string);
//			}
//			
//			 
//		}
//		System.out.println(b);
		
		
		/*
		 * String string = b.toString(); String trim = string.replace("PNR",
		 * " ").trim(); System.out.println(trim);
		 */
		
		
	}

	
}
