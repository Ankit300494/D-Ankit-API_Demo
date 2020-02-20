package com.demo.API_Demo;

import static com.jayway.restassured.RestAssured.given;

import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class AppDemo {
	@Test
	public void exee()
    {
		
		try 
		{
	
			Response resp=
		     		   given()
		    		   .contentType(ContentType.JSON)
		    		   .when()
		    		   .get("https://jsonplaceholder.typicode.com/users");
		       System.out.println("status code is= "+ resp.getStatusCode());
		       System.out.println("****************************************************************************");
		       System.out.println("JSON response is "+ resp.asString());
		       
		       System.out.println("****************************************************************************");
		       // get the JsonPath object instance from the Response interface
			/*
			 * JsonPath jsonPathEvaluator = resp.jsonPath() ; // Read all the books as a
			 * List of String. Each item in the list // represent a book node in the REST
			 * service Response List<String> allstreet =
			 * jsonPathEvaluator.getList("address.street"); // Iterate over the list and
			 * print individual book item for(String street : allstreet) {
			 * System.out.println("Address street are is: " + street); }
			 */
		       Scanner sc= new Scanner(System.in);
		       System.out.print("Enter the id = ");
		       Object i = sc.next();
			
			  Response respex= 
					  			given() 
					  			.contentType(ContentType.JSON) 
					  			.when()
					  			.get("https://jsonplaceholder.typicode.com/users"+"?id="+i);
			 
			  System.out.println("status code is= "+ respex.getStatusCode());
			  System.out.println(
			  "****************************************************************************"
			  ); System.out.println("JSON is "+ respex.asString());
			 
			/*
			 * // Specify the base URL to the RESTful web service RestAssured.baseURI
			 * ="https://jsonplaceholder.typicode.com/users"; RequestSpecification request =
			 * RestAssured.given(); Response response = request.queryParam("q","London,UK")
			 * 
			 * .get("/weather");
			 */
			/*
			 * String cty = "1";
			 * 
			 * // Here the name of the variable have no relation with the URL parameter
			 * {country} Response responsee= RestAssured.given() .when()
			 * .get("http://restcountries.eu/rest/v1/name/{id}", cty);
			 * System.out.println(responsee.asString());
			 */
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error occured..");
		}
    }
}
