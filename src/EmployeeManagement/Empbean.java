package EmployeeManagement;

public class Empbean {
	
	private int id;
	
	private String name;
	
	private String Address;
	
	

	public Empbean() {
		super();
	}

	public Empbean(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}

	@Override
	public String toString() {
		return "Empbean [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	

}
