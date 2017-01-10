package xe.com;

import java.net.MalformedURLException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xecom_UI.HomePagexecom_UI;

public class ID0002_RemovePMpost {

	private String baseUrl;
	private FirefoxDriver driver;
    private HomePagexecom_UI home; 
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://mlo04.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = new FirefoxDriver();
		baseUrl = "http://mlo04.xe.com/";
}
	 @Test
	  public void a_redirecttoXecom(){
		//	C5370	Migration - FAQ - Add new question and answer 
		  driver.get(baseUrl);
		  driver.get(baseUrl+"jobs");
		
		  Assert.assertFalse(driver.getPageSource().contains("Product Manager"));
		  
	 }
	 
	 @AfterClass
	  public void close() {
	  driver.close();
	  }	
	 
}