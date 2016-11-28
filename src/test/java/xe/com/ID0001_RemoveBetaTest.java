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
import xecom_UI.removeBetatest_UI;
import xemt_UI.Businessenquiry_UI;



public class ID0001_RemoveBetaTest {

	private String baseUrl;
	private WebDriver driver;
    private removeBetatest_UI home;
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefoxLocal") String browser) throws MalformedURLException, InterruptedException {
		driver = Browsers.getDriver(browser);
		baseUrl = url;
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
  public void a_redirecttoXecomBetaNotFound() throws InterruptedException{
	//	C5255	verify- http://www.xe.com/beta/ is removed or not
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
  
  @Test
  public void a_redirecttoXecomMigrationFaq() throws InterruptedException{
	//	C5370	Migration - FAQ - Add new question and answer 
	  driver.get(baseUrl);
	  List<WebElement> p = driver.findElements(By.cssSelector(".moduleActionClass li"));
	  p.get(1).click();
	  String text1=  home.faqList_UI.get(12).getText();
	  Assert.assertEquals(text1,"What will happen with the XE Currency App after the migration?");
	  driver.get(baseUrl+"migration/answer.php?type=general&q=13");
	  String text2= home.moduleParagraph_UI.get(0).getText();
	  Assert.assertEquals(text2,"The XE Currency App has always been entirely independent from our XE Trade service, and as such is not affected in any way by this migration.");
	  String text3= home.moduleParagraph_UI.get(1).getText();
	  Assert.assertEquals(text3,"Our intention is that in future we will be able to develop deeper links between our services to allow us to continually enhance the customer experience we provide.");
	  String text4= home.moduleParagraph_UI.get(2).getText();
	  Assert.assertEquals(text4,"After October 30th, many elements of the new XE Money Transfer service are mobile responsive and you will easily be able to place transactions on your mobile device.");
	  }
@AfterClass
public void close() {
driver.close();
}

}
