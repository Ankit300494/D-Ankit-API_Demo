package com.demo.API_Demo;
import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class App 
{	
	//public static void main( String[] args )
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
		       System.out.println("JSON is "+ resp.asString());
		       
		       System.out.println("****************************************************************************");
		       // get the JsonPath object instance from the Response interface
		       JsonPath jsonPathEvaluator = resp.jsonPath()  ;  
		       // Read all the books as a List of String. Each item in the list
		       // represent a book node in the REST service Response
		       List<String> allstreet = jsonPathEvaluator.getList("address.street");
		      
		       // Iterate over the list and print individual book item
		       for(String street : allstreet)
		       {
		         System.out.println("Address street are is: " + street);
		       } 
		       System.out.println("****************************************************************************");
		       System.out.println(jsonPathEvaluator.hashCode());
		       Map<Integer,String > hm=new HashMap<Integer, String>();
				/* hm.put(1, "sjkakj"); */
		       
		       JsonPath jsonpathvalue= resp.jsonPath();
		       List<String> alldata= jsonpathvalue.getList(" the ids are as follows "+"address.city");
		       for (String ides : alldata) {
				System.out.println(ides);
			}
		       
		      for (Map.Entry<Integer, String> entry: hm.entrySet()) {
		    	  System.out.println(""+entry.getKey()+""+entry.getValue()); 
		    	  System.out.println("****************************************************************************");
		    	  JsonPath jsonpathex = resp.jsonPath();
		    	 // Map<Integer,String > hm=jsonpathex.getMap(path, keyType, valueType)
		      }
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error occured..........");
		}
     }
}
