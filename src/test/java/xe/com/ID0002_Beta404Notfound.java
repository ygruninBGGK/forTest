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



public class ID0002_Beta404Notfound {

	private String baseUrl;
	private FirefoxDriver driver;
    private String txt02;
    private String txt03;
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://mlo04.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = new FirefoxDriver();
		baseUrl = "http://mlo04.xe.com/";
	}
		
  @Test
  public void a_redirecttoXecom(){
	//	C5255	verify- http://www.xe.com/beta/ is removed or not
	  driver.get(baseUrl);
	  driver.get(baseUrl+"beta");

	  String txt01 = driver.findElement(By.cssSelector(".module.clearfix.errors h1")).getText();
	  Assert.assertEquals(txt01, "HTTP Status Code 404: Not Found");
	  String txt02 =  driver.findElement(By.cssSelector(".subTitle2")).getText();
	  Assert.assertEquals(txt02, "HTTP Status Code 404:"+"\n"+"Not Found");
	  String txt03 = driver.findElement(By.cssSelector(".pageDescription")).getText();
	  Assert.assertEquals(txt03, "This page doesn’t exist. Try double checking the address to ensure that it is spelled correctly. Otherwise, check out our homepage or other services listed below:");
  }

  
  

@AfterClass
public void close() {
driver.close();
}
}
