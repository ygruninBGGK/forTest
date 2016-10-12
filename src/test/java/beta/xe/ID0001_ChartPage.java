package beta.xe;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ID0001_ChartPage {
	private String baseUrl;
	private FirefoxDriver driver;

	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://mlo04.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = new FirefoxDriver();
		baseUrl = "http://mlo01.xe.com/";
		
		
	}
	
	
	  @Test
	  public void a_redirectToXeMt() {
			//C5957	check xe's currency chart navigating properly or not
		  driver.get(baseUrl);
		  driver.get(baseUrl+"currencycharts/");
		  //	C5958	check dynamic H1 appearing or not
		  List<WebElement> c1 = driver.findElements(By.cssSelector(".module.clearfix h1 ")) ;
		  String text2=  c1.get(0).getText();
		  Assert.assertEquals(text2,"XE Currency Charts");
		  //C5959	check the chart- Chart lets you see this pair's currency rate history for up to 10 years! XE uses highly accurate, live mid-market rates.  
}
	  @AfterClass
	  public void close() {
	  driver.close();
	  }	
}
