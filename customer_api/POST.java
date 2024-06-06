package customer_api;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class POST {
	@Test(dataProvider="userdata")		
	  public static void customerlogin(String name, String job) {
			
			RestAssured.baseURI="https://homelyfservices.com/customerAPI/Swagger/index.html";
			
			RequestSpecification httprequest=RestAssured.given().log().all();
			
			
			JSONObject requestpara= new JSONObject();
			requestpara.put("emailAddress", "ganesh87@gmail.com");
			requestpara.put("mobileNumber", "9822154859");
			requestpara.put("password", "Ashok%795");
			requestpara.put("type", "c");
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
	 	 
	 	 String [][] CreateUserdata = {{"emailAddress", "ganesh87@gmail.com"},{"mobileNumber", "9822154859"},{"password", "Ashok%795"},{"type", "c"},{"location","Pune"}};
			return (CreateUserdata);}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  @Test(dataProvider="new")		
	  public static void newbooking(String name, String job) {
			
			RestAssured.baseURI="https://homelyfservices.com/customerAPI/Swagger/index.html";
			
			RequestSpecification httprequest=(RequestSpecification) RestAssured.given().log().all().auth();
			
			JSONObject requestpara= new JSONObject();

			requestpara.put("serviceID", "2");
			requestpara.put("quantity", "2");
			requestpara.put("scheduledOn", "2024-05-31T10:24:34.408Z");
			requestpara.put("addressID","40419");
			httprequest.body(requestpara.toJSONString());
	io.restassured.response.Response response=httprequest.request(Method.POST,"https://homelyfservices.com/CustomerAPI/api/Booking");
			
	        String responsebody=response.getBody().asString();
			
			int statusCode=response.statusCode();
			Assert.assertEquals(statusCode, 200);
			
			System.out.println("Response body is:"+responsebody);
			System.out.println("StatusCode:"+statusCode);
			
	  }

	  @DataProvider(name="new")
	  
	  String [][] nbook(){
	 	 
	 	 String [][] newbok = {{"serviceID", "2"},{"quantity", "2"},{"scheduledOn", "2024-05-31T10:24:34.408Z"},{"addressID", "40419"}};
			return (newbok);}
	  
	  
	  
	  
	  
	  
	
	  
	  
	  
	  
	   @Test(dataProvider="cal")		
	  public static void bookingcalculation(String name, String job) {
			
			RestAssured.baseURI="https://homelyfservices.com/customerAPI/Swagger/index.html";
			
			RequestSpecification httprequest=(RequestSpecification) RestAssured.given().log().all();
			
			JSONObject requestpara= new JSONObject();

			requestpara.put("serviceID", "2");
			requestpara.put("quantity", "2");
			
			
			httprequest.headers("Content-Type","application/json");
			
			httprequest.body(requestpara.toJSONString());
	io.restassured.response.Response response=httprequest.request(Method.POST,"https://homelyfservices.com/CustomerAPI/api/Booking/Calculate");
			
	        String responsebody=response.getBody().asString();
			
			int statusCode=response.statusCode();
			Assert.assertEquals(statusCode, 200);
			
			System.out.println("Response body is:"+responsebody);
			System.out.println("StatusCode:"+statusCode);
			
	
	
	    
	  
	  

}

}
