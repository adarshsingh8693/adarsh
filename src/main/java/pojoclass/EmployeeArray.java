package pojoclass;

public class EmployeeArray {

	String name;
	String id;
	int []arr;
	//step 2 create constructor to intialize values
	public EmployeeArray(String name, String id, int arr[]) {
		super();
		this.name = name;
		this.id = id;
		this.arr = arr;
	}
	//step 3 to tigger the excecution
	public EmployeeArray() {
		
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
	public int[] getarr() {
		return arr;
	}
	public void setPhno(int[] arr) {
		this.arr = arr;
	}

	
	
	
	
	
	
	
	
	
}

	

