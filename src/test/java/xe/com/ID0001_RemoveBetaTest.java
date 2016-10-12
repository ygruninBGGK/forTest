package xe.com;

import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;

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



public class ID0001_RemoveBetaTest {

	private String baseUrl;
	private FirefoxDriver driver;

	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://mlo04.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = new FirefoxDriver();
		baseUrl = "http://mlo01.xe.com/";
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
  @Test
  public void a_redirecttoXecomBetaNotFound(){
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
  
  @Test
  public void a_redirecttoXecomMigrationFaq(){
	//	C5370	Migration - FAQ - Add new question and answer 
	  driver.get(baseUrl);
	  driver.get(baseUrl+"migration/faq.php");
	 // String txt01 = home.FaqList.get(12).findElement(By.cssSelector(".faqList")).getText();
	 // Assert.assertEquals(txt01, "What will happen with the XE Currency App after the migration?");
	  List<WebElement> p = driver.findElements(By.cssSelector(".faqList li")) ;
	  String text1=  p.get(12).getText();
	  Assert.assertEquals(text1,"What will happen with the XE Currency App after the migration?");
	  driver.get(baseUrl+"migration/answer.php?type=general&q=13");
	  List<WebElement> c1 = driver.findElements(By.cssSelector(".module.clearfix p")) ;
	  String text2=  c1.get(0).getText();
	  Assert.assertEquals(text2,"The XE Currency App has always been entirely independent from our XE Trade service, and as such is not affected in any way by this migration.");
	  String text3=  c1.get(1).getText();
	  Assert.assertEquals(text3,"Our intention is that in future we will be able to develop deeper links between our services to allow us to continually enhance the customer experience we provide.");
	  String text4=  c1.get(2).getText();
	  Assert.assertEquals(text4,"After October 30th, many elements of the new XE Money Transfer service are mobile responsive and you will easily be able to place transactions on your mobile device.");
	  
}
@AfterClass
public void close() {
driver.close();
}

}
