package beta.xe;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import xecom_UI.Currencycharts_UI;

public class ID0001_ChartPage {
	private String baseUrl;
	private FirefoxDriver driver;
	private Currencycharts_UI curr;
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://mlo01.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = new FirefoxDriver();
		baseUrl = "http://mlo01.xe.com/";
		curr = PageFactory.initElements(driver, Currencycharts_UI.class);
		
	}
	
	
	  @Test
	  public void a_redirectToXeMt() throws InterruptedException {
			//C5957	check xe's currency chart navigating properly or not
		  driver.get(baseUrl);
		  driver.get(baseUrl+"currencycharts/");
		  //	C5958	check dynamic H1 appearing or not
		  String txt01 = driver.findElement(By.cssSelector(".module.clearfix h1")).getText();
		  Assert.assertEquals(txt01,"XE Currency Charts");
		  //C5959	check the chart- Chart lets you see this pair's currency rate history for up to 10 years! XE uses highly accurate, live mid-market rates.  
		  curr.fillFrom("CAD");
		  curr.fillTo("INR");
          driver.findElement(By.id("chartForm_go_btn_svg")).click();
          String txt02 = driver.findElement(By.cssSelector(".module.clearfix h1")).getText();
		  Assert.assertEquals(txt02,"XE Currency Charts: CAD to INR");
		  String txt03 = driver.findElement(By.cssSelector(".chartDescription")).getText();
		  Assert.assertEquals(txt03,"Canadian Dollar to Indian Rupee Chart"+"\n"+ "This CAD/INR Chart lets you see this pair's currency rate history for up to 10 years! XE uses highly accurate, live mid-market rates.");
		  List<WebElement> h = driver.findElements(By.cssSelector(".module.clearfix  h2")) ;
		  String txt04 =  h.get(1).getText();
		  Assert.assertEquals(txt04,"CAD to INR Chart");
		  //	C5962	check the chart input data and check convert and inverse buttons are working properly or not 
		  driver.get(baseUrl+"currencycharts/");
		  driver.findElement(By.id("inverseBtn")).click();
	 // C5960	check the internal ad-Replacing the block starting with "Do you need to transfer money?"
	  }
	  @AfterClass
      public void close() {
	  driver.close();
	  }	
}
