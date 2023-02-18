package crudWithOutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DeleteProject {

	@Test
	public void deletepro() {
	Response resp=RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_18776");
	resp.then().log().all();
	int actstatus = resp.getStatusCode();
	Assert.assertEquals(204,actstatus);
	
}
}