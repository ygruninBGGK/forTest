package xe.com;

import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
import xecom_UI.removeBetatest_UI;
import xemt_UI.Businessenquiry_UI;



//C5256	check the following links and make sure references to beta removed. 1. http://www.xe.com/sitemap.php 2. http://www.xe.com/tools.php 
//C5255	verify- http://www.xe.com/beta/ is removed or not
//C5370	Migration - FAQ - Add new question and answer 

public class ID0001_RemoveBetaTest {

	private String baseUrl;
	private WebDriver driver;
    private removeBetatest_UI home;
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefox") String browser) throws MalformedURLException, InterruptedException {
		driver = Browsers.getDriver(browser);
		home = PageFactory.initElements(driver, removeBetatest_UI.class);
		baseUrl = url;
	}

		
  @Test
  public void a_redirecttoXecom(){
	  
	  driver.get(baseUrl);
	  driver.manage().window().setSize(new Dimension(1920, 1080));
	  driver.get(baseUrl+"sitemap.php");
	  Assert.assertFalse(driver.getPageSource().contains("beta"));
	  driver.get(baseUrl+"tools.php");
	  Assert.assertFalse(driver.getPageSource().contains("beta"));
	 }
  
  @Test
  public void b_redirecttoXecomBetaNotFound() throws InterruptedException{
	
	  driver.get(baseUrl);
	  driver.get(baseUrl+"beta");
	  Thread.sleep(2000);
      String txt01 = home.moduleClearfix_UI.getText();
	  Assert.assertEquals(txt01, "HTTP Status Code 404: Not Found");
	  String txt02 =  home.subTitle_UI.getText();
	  Assert.assertEquals(txt02, "HTTP Status Code 404:"+"\n"+"Not Found");
	  String txt03 = home.pageDescription_UI.getText();
	  Assert.assertEquals(txt03, "This page doesn’t exist. Try double checking the address to ensure that it is spelled correctly. Otherwise, check out our homepage or other services listed below:");
  }
  
 
@AfterClass
public void close() {
driver.close();
}

}
