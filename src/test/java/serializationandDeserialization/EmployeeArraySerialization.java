package serializationandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.Employee;
import pojoclass.EmployeeArray;

public class EmployeeArraySerialization {

	
	@Test
	public void employSeri() throws Exception, JsonMappingException, IOException {
		int []arr= {97773,3663773};
		EmployeeArray emp=new EmployeeArray("sach","123",arr);
		
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./empAr.json"),emp);
	}
	
}
