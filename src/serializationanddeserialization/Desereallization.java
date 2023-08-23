package serializationanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Desereallization 
{
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{	
		// kis location se object read karenge
		FileInputStream out= new FileInputStream("C:\\Users\\khan abid\\Desktop\\sereal.java");
		
		// object read kRNE KE LIYE 
		ObjectInputStream obj= new ObjectInputStream(out);
		
		// is merhod se object read karenge
		 StudentSerilizable st=	(StudentSerilizable) obj.readObject();
		 
		 System.out.println(st.getAge());
		 System.out.println(st.getName());
		 System.out.println(st.getAdress());
				
		
		
		
		
	}

}
