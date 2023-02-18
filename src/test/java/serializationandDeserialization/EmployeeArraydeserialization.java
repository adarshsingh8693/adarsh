package serializationandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoclass.Employee;
import pojoclass.EmployeeArray;

public class EmployeeArraydeserialization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper omap=new ObjectMapper();
		EmployeeArray data=omap.readValue(new File("./empAr.json"),EmployeeArray.class);
		System.out.println(data.getName());
		System.out.println(data.getId());
		int []br=data.getarr();
		for (int i = 0; i < br.length; i++) {
			System.out.println(br[i]);
		}

	}

}
