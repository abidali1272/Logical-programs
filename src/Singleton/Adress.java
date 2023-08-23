package Singleton;

public class Adress {
	
	public int id;
	
	public String name;
	
	public Adress adress= new Adress(main());
	
	public 	Adress (Adress adress)
	{
		this.adress=adress;
		
	}
	
	public 	Adress ()
	{
		
		
	}
	
	public 	Adress (int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Adress  main()
	{
		
		Adress em1= new Adress(2,"shabbir");
		System.out.println(em1);
		
		
		Adress em= new Adress();
		em.setId(1);
		em.setName("jamal");
		
		Adress em2= new Adress(2,"shabbir");
		
		return em;
	
		
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
