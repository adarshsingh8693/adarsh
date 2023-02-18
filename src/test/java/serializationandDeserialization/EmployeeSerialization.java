package serializationandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.Employee;

public class EmployeeSerialization {

	@Test
	public void employSeri() throws Exception, JsonMappingException, IOException {
		Employee emp=new Employee("sach","123",2);
		
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./emp.json"),emp);
	}

}
