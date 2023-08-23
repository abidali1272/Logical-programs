package SimpleCrud;

import java.util.List;

public class bean {
	
	

	private String name;
	
	private int age;
	
	private List<Integer> Hotel;
	
	public List<Integer> getHotel() {
		return Hotel;
	}

	public void setHotel(List<Integer> hotel) {
		Hotel = hotel;
	}

	

	
	public bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "bean [name=" + name + ", age=" + age + ", Hotel=" + Hotel + "]";
	}

	public bean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
 ;

}
