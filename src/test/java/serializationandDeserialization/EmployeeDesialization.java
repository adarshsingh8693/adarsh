package serializationandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.Employee;

public class EmployeeDesialization {
	
	@Test
	public void employSeri() throws Exception, JsonMappingException, IOException {
		
		
		ObjectMapper omap=new ObjectMapper();
		Employee data=omap.readValue(new File("./emp.json"),Employee.class);
		System.out.println(data.getName());
		System.out.println(data.getId());
		System.out.println(data.getPhno());
	} 

}
