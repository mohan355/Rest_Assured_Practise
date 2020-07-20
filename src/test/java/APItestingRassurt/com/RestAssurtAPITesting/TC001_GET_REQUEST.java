package APItestingRassurt.com.RestAssurtAPITesting;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC001_GET_REQUEST {
	 @Test
	  public void f() {
		 Response servd= get("https://reqres.in/api/users?page=3");
		 servd.prettyPrint();
		 System.out.println(servd.statusCode());
		 System.out.println(servd.getTime());
	 }
	 
	 @Test
	  public void g() {
	 
	 File obj=new File ("C:\\Users\\kafle\\Desktop\\PNT\\RestAssurtAPITesting\\Rest.json");
	  Response creat= given().contentType("application/json").body(obj).post("https://reqres.in/api/register");
	  creat.prettyPrint();
	  creat.then().statusCode(200);
	 }
}
