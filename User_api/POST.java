package User_api;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class POST {
	@Test(dataProvider="userdata")		
	  public static void login(String name, String job) {
			
			RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
			
			RequestSpecification httprequest=RestAssured.given().log().all();
			
			JSONObject requestpara= new JSONObject();
			requestpara.put("emailAddress", "vaxa3680@cgbird.com");
			requestpara.put("mobileNumber", "9810986543");
			requestpara.put("password", "P@Testing1");
			requestpara.put("type", "v");
			requestpara.put("location","Pune");
			
			httprequest.headers("Content-Type","application/json");
			
			httprequest.body(requestpara.toJSONString());
	io.restassured.response.Response response=httprequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/Login");
			
	        String responsebody=response.getBody().asString();
			
			int statusCode=response.statusCode();
			Assert.assertEquals(statusCode, 200);
			
			System.out.println("Response body is:"+responsebody);
			System.out.println("StatusCode:"+statusCode);
			
	  }

	  @DataProvider(name="userdata")
	  
	  String [][] UpUserdata(){
	 	 
	 	 String [][] CreateUserdata = {{"emailAddress", "vaxa3680@cgbird.com"},{"mobileNumber", "9810986543"},{"password", "P@Testing1"},{"type", "v"},{"location","pune"}};
			return (CreateUserdata);}
	  
	  
	  
	  
	  
	  
	  
	  
	  


@Test(dataProvider="emailotp")		
public static void sendemailotp(String name, String job) {
		
		RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
		
		RequestSpecification httprequest=RestAssured.given().log().all();
		
		JSONObject requestpara= new JSONObject();
		requestpara.put("emailAddress", "vaxa3680@cgbird.com");
		
		
		httprequest.headers("Content-Type","application/json");
		
		httprequest.body(requestpara.toJSONString());
io.restassured.response.Response response=httprequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/SendEmailOTP");
		
   String responsebody=response.getBody().asString();
		
		int statusCode=response.statusCode();
		Assert.assertEquals(statusCode, 200);
		
		System.out.println("Response body is:"+responsebody);
		System.out.println("StatusCode:"+statusCode);
		
}

@DataProvider(name="emailotp")

String [][] resetp(){
	 
	 String [][] email = {{"emailAddress", "vaxa3680@cgbird.com"}};
		return (email);}














@Test(dataProvider="SMSotp")		
public static void sendeSMSotp(String name, String job) {
		
		RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
		
		RequestSpecification httprequest=RestAssured.given().log().all();
		
		JSONObject requestpara= new JSONObject();
		requestpara.put("mobilenumber", "9810986543");
		
		
		httprequest.headers("Content-Type","application/json");
		
		httprequest.body(requestpara.toJSONString());
io.restassured.response.Response response=httprequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/SendSMSOTP");
		
   String responsebody=response.getBody().asString();
		
		int statusCode=response.statusCode();
		Assert.assertEquals(statusCode, 200);
		
		System.out.println("Response body is:"+responsebody);
		System.out.println("StatusCode:"+statusCode);
		
}

@DataProvider(name="SMSotp")

String [][] Sms(){
	 
	 String [][] sms = {{"mobilenumber", "9810986543"}};
		return (sms);}














@Test(dataProvider="SMSv")		
public static void verifySMSOTP(String name, String job) {
		
		RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
		
		RequestSpecification httprequest=RestAssured.given().log().all();
		
		JSONObject requestpara= new JSONObject();
		requestpara.put("mobilenumber", "9810986543");
		requestpara.put("otp", "1234");
		
		
		httprequest.headers("Content-Type","application/json");
		
		httprequest.body(requestpara.toJSONString());
io.restassured.response.Response response=httprequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/VerifySMS");
		
   String responsebody=response.getBody().asString();
		
		int statusCode=response.statusCode();
		Assert.assertEquals(statusCode, 200);
		
		System.out.println("Response body is:"+responsebody);
		System.out.println("StatusCode:"+statusCode);
		
}

@DataProvider(name="SMSv")

String [][] SMSveri(){
	 
	 String [][] varify = {{"mobilenumber", "9810986543"}};
		return (varify);}








}



