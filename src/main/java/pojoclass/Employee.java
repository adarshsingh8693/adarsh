package pojoclass;

public class Employee {

	
	//step 1 : declare the variables globally
	String name;
	String id;
	int phno;
	//step 2 create constructor to intialize values
	public Employee(String name, String id, int phno) {
		super();
		this.name = name;
		this.id = id;
		this.phno = phno;
	}
	//step 3 to tigger the excecution
	public Employee() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}

	
	
	
	
	
	
	
	
	
}
