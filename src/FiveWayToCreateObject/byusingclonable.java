package FiveWayToCreateObject;

public class byusingclonable  implements Cloneable
{
	
	int age;
	String name;
	String Adress;
	
	 byusingclonable (int age,String name,String Adress)
	 {
		 this.age=age;
		 this.name=name;
		 this.Adress=Adress;
		 
	 }
	
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
		  
	
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		byusingclonable s2= new byusingclonable(12,"abid","sakianka");
		
		System.out.println(s2);
		
		System.out.println();
		
		
		byusingclonable	 obj = (byusingclonable) s2.clone();
		
		System.out.println(obj.Adress+" "+" "+obj.age+ " "+obj.name);
		
		
		
		
	}


	@Override
	public String toString() {
		return "byusingclonable [age=" + age + ", name=" + name + ", Adress=" + Adress + "]";
	}

}
