package serializationanddeserialization;

import java.io.Serializable;

public class StudentSerilizable implements Serializable
{
	
	
	private String name;
	
	private int age;
	
	private String Adress;
	

	public StudentSerilizable(String name, int age, String adress) {
		super();
		this.name = name;
		this.age = age;
		Adress = adress;
	}

	public StudentSerilizable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}
	
	
	
	

}
