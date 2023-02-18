package serializationandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeWithObject;
import pojoclass.Spouse;

public class EmployeeObjectSerialization {
    @Test
	public void emplSerWithObject() throws Exception{
		int []ph= {1234,5778};
		Spouse sp=new Spouse("adrsh","25",ph);
		EmployeeWithObject emp=new EmployeeWithObject("adarsh",sp);
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./empO b.json"),emp);
	}

}
