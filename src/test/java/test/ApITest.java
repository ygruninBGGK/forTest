package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import okhttp3.Credentials;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import okhttp3.Response;


import java.io.IOException;
import java.net.MalformedURLException;



/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'ygrunin' at '23/11/16 12:56 PM' with Gradle 2.13
 *
 * @author ygrunin, @date 23/11/16 12:56 PM
 */
public class ApITest {
	
	
	private String baseUrl;
	String credential;
	
	// Initiate the browser and PageFactory
    @Parameters("BaseUrl")
    @BeforeClass
    public void BaseUrl(@Optional("http://api.fixer.io/2000-01-03") String url ) throws MalformedURLException {
   
    	baseUrl = url;
    	
    }
	
	

    @Test()
    public void a_api_Positive() throws IOException { 	
    	 
    	//Request 
    	OkHttpClient client = new OkHttpClient();
    	Request request = new Request.Builder() 
    		      .url(baseUrl)
    		      .get()
    		      .build();	  
    		  
    	///Response 	  
		Response response = client.newCall(request).execute();
		String res = response.body().string(); 
		JsonNode  rootNode = new ObjectMapper().readTree(res);
		JsonNode  base = rootNode.get("base");
		JsonNode  date = rootNode.get("date");
		JsonNode  rates = rootNode.get("rates");
		JsonNode AUD = rates.get("AUD");
		
		/////////Assertions//////////
	  	Assert.assertEquals(base.toString(), "\"EUR\"");  
	  	Assert.assertEquals(date.toString(), "\"2000-01-03\"");  
	  	Assert.assertEquals(AUD.toString() ,"1.5346");  // we can check all other rates by this way
    } 
    
    @Test()
    public void a_api_negative() throws IOException { 	 
    	//Request 
    	OkHttpClient client = new OkHttpClient();
    	Request request = new Request.Builder() 
    		      .url("http://api.fixer.io/1000-01-03")
    		      .get()
    		      .build();	  
    		  
    	///Response 	  
		Response response = client.newCall(request).execute();
		String res = response.body().string(); 
		JsonNode  rootNode = new ObjectMapper().readTree(res);
		JsonNode  error = rootNode.get("error");
		 
	  	Assert.assertEquals(error.toString() ,"\"Date too old\"");  // we can check all other rates by this way
    } 
    
    
   
}
