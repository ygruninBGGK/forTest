package xe.com;


    import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

import utils.Browsers;



	public class ID0003_FooterHeader{

		private String baseUrl;
		private WebDriver driver;
	   	
		@Parameters({"BaseUrl","browser"})
	    @BeforeClass
	    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
			driver = Browsers.getDriver(browser);
			baseUrl = url;
		}
			
	  @Test
	  public void a_redirecttoXecom(){
	  // C5261	check and make sure headers and footer of Xe.com are changed from h2 to h3
		  driver.get(baseUrl);
		  List<WebElement> c1 = driver.findElements(By.cssSelector("#footer h3")) ;
		  String text2=  c1.get(0).getText();
		  Assert.assertEquals(text2,"Tools");
		  String text3=  c1.get(1).getText();
		  Assert.assertEquals(text3,"Transfer Money");
		  String text4=  c1.get(2).getText();
		  Assert.assertEquals(text4,"Currency Data");
		  String text5=  c1.get(3).getText();
		  Assert.assertEquals(text5,"Apps");
		  String text6=  c1.get(4).getText();
		  Assert.assertEquals(text6,"Use our Content");
		  String text7=  c1.get(5).getText();
		  Assert.assertEquals(text7,"Learn");
		  }
	  
	  @AfterClass
	  public void close() {
	  driver.close();
	  }	
	}
