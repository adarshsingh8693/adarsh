package crudWithOutBdd;


import org.codehaus.jackson.map.util.JSONPObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {

	@Test
	public void getAllProj() {
	   JSONObject jobj=new JSONObject();
	   jobj.put("createdBy", "adarsh"+" "+Math.random());
	   jobj.put("projectName", "BlackBear");
	   jobj.put("status","completed");
	   jobj.put("teamSize",12);
	   
	   RequestSpecification req=RestAssured.given();
	   req.body(jobj);
	   req.contentType(ContentType.JSON);
	   
	   Response resp=req.post("http://rmgtestingserver:8084/addProject");
	   
	   System.out.println(resp.contentType());
	   System.out.println(resp.prettyPrint());
	   System.out.println(resp.prettyPeek());
	   System.out.println(resp.asString()); 
	  
	   
	   
	}

}
