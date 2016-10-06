package xe.com;

import java.net.MalformedURLException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ID0001_RemoveBetaTest {

	private String baseUrl;
	private FirefoxDriver driver;

	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://mlo04.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = new FirefoxDriver();
		baseUrl = "http://mlo04.xe.com/";
	}
		
  @Test
  public void a_redirecttoXecom(){
	//C5256	check the following links and make sure references to beta removed. 1. http://www.xe.com/sitemap.php 2. http://www.xe.com/tools.php 
	  driver.get(baseUrl);
	  driver.get(baseUrl+"sitemap.php");
	  Assert.assertFalse(driver.getPageSource().contains("beta"));
	  driver.get(baseUrl+"tools.php");
	  Assert.assertFalse(driver.getPageSource().contains("beta"));
	  
	  
	  
  }


@AfterClass
public void close() {
driver.close();
}

}
