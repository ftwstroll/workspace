package override_equals_method;

public class Employee {

	
	private int id;
	private String name;
	
	
	
	public Employee() 
	{
		
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public boolean equals(Object o) {
		boolean b=false;
		Employee e2=(Employee)o;
		if(this.id==e2.id) {
			b=true;
		}
		return b;
	}
	
	
}
