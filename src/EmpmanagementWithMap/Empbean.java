package EmpmanagementWithMap;

public class Empbean {
	
	private int id;
	
	private String name;
	
	private String gmail ;
	
	public Empbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empbean(int id, String name, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
	}

	@Override
	public String toString() {
		return "Empbean [id=" + id + ", name=" + name + ", gmail=" + gmail + "]";
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

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	

}
