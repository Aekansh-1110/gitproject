package User_api;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class GET {
	 @Test
	    public static void category () {
		  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
		  RequestSpecification httpRequest = RestAssured.given().log().all();
		 io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/Category");
		 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
		   Assert.assertEquals(statuscode,200);
		  System.out.println("responce body is:"+responcebody );
		  System.out.println("statuscode:"+statuscode);}
	  
	  
	  @Test
		 public static void country() {
			  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			  RequestSpecification httpRequest = RestAssured.given().log().all();
		 io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/Country");
			 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
			   Assert.assertEquals(statuscode,200);
			   System.out.println("responce body is:"+responcebody );
				  System.out.println("statuscode:"+statuscode);}
	  
	  
	  
	  
	  @Test
		 public static void state() {
			  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			  RequestSpecification httpRequest = RestAssured.given().log().all();
		 io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/State");
			 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
			   Assert.assertEquals(statuscode,200);
			   System.out.println("responce body is:"+responcebody );
				  System.out.println("statuscode:"+statuscode);}
	  
	  

	  

	  @Test
		 public static void city() {
			  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			  RequestSpecification httpRequest = RestAssured.given().log().all();
		 io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/City");
			 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
			   Assert.assertEquals(statuscode,200);
			   System.out.println("responce body is:"+responcebody );
				  System.out.println("statuscode:"+statuscode);}
	  
	  
	  
	  @Test
		 public static void postcode() {
			  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			  RequestSpecification httpRequest = RestAssured.given().log().all();
		 io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/PostCode");
			 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
			   Assert.assertEquals(statuscode,200);
			   System.out.println("responce body is:"+responcebody );
				  System.out.println("statuscode:"+statuscode);}

	  
	  
	  @Test
		 public static void subcaregory() {
			  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			  RequestSpecification httpRequest = RestAssured.given().log().all();
		 io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/SubCategory");
		 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
			   Assert.assertEquals(statuscode,200);
			   System.out.println("responce body is:"+responcebody );
				  System.out.println("statuscode:"+statuscode);}
	  

	 @Test
	  
		 public static void Role() {
			  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			  RequestSpecification httpRequest = RestAssured.given().log().all();
			 String auth ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6IjQwNDQ5IiwibmFtZWlkIjoiUG9zdG1hblJ1bnRpbWUvNy4zOS4wIiwibmJmIjoxNzE2ODc4MjQ1LCJleHAiOjE3MTY4OTI2NDUsImlhdCI6MTcxNjg3ODI0NSwiaXNzIjoiaHR0cHM6Ly9xZHRhcy5jb20vIiwiYXVkIjoiaHR0cHM6Ly9xZHRhcy5jb20vVXNlckFQSS8ifQ.a8SpmEsASKPMgxTDp7skgSBrWhFjuQP78FjJf1F4S94";
		         httpRequest.header("Authorization", auth, " Bearer Token");
		io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/Role");
		 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
			   Assert.assertEquals(statuscode,200);
			   System.out.println("responce body is:"+responcebody );
				  System.out.println("statuscode:"+statuscode);}
	 

	  @Test
		 public static void Postcodeid() {
			  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			  RequestSpecification httpRequest = RestAssured.given().log().all();
		 io.restassured.response.Response response = httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/PostCode/2");
		 String responcebody=  response.getBody().asString();
		   int statuscode= response.statusCode();
			   Assert.assertEquals(statuscode,200);
			   System.out.println("responce body is:"+responcebody );
				  System.out.println("statuscode:"+statuscode);}





			
	}
	  



