package pojoclass;

public class Spouse {

	String name;
	String age;
	int []phno;
	public Spouse(String name, String age, int[] phno) {
		super();
		this.name = name;
		this.age = age;
		this.phno = phno;
	}
	public Spouse() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int[] getPhno() {
		return phno;
	}
	public void setPhno(int[] phno) {
		this.phno = phno;
	}
	
	
	
	
	
}
