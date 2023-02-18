package serializationandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeWithObject;

public class EmployeeObjectDeserialization {

	
        @Test
		public void empDeserObj() throws Exception {
			ObjectMapper omap=new ObjectMapper();
			EmployeeWithObject data=omap.readValue(new File("./empOb.json"),EmployeeWithObject.class);
			System.out.println(data.getSpouse().getPhno()[1]);
		}
		
	

}
