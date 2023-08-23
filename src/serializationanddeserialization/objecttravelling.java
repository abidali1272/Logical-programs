package serializationanddeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objecttravelling 
{			
	
	public static void main(String[] args) throws IOException 
	{
		// wo object jisko network mai bhejna hai
		 StudentSerilizable obj= new  StudentSerilizable();
		 obj.setAge(18);
		 obj.setName("zaid");
		 obj.setAdress("khairani");
		 
		 // kis location per wo object save karana hai
		 FileOutputStream out= new  FileOutputStream("C:\\Users\\khan abid\\Desktop\\sereal.java");
		 
		 //object ko us locatio per write karane ke liye iska use karenge
		 ObjectOutputStream ob= new ObjectOutputStream(out);
		 
		 // is method ki help se wo object write hoga
		 ob.writeObject(obj);
		 
		 System.out.println("sucesss");
		 
		 out.close();
		 ob.close();
		
		
	}

}
