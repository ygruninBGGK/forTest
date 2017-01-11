package xeMt;

import org.testng.annotations.Test;

import utils.Browsers; 
import utils.General; 
import xemt_UI.RemoveRequestDemo_UI; 
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//	C7616	XE Money Transfer - Remove "Request a Demo"  
// C6163	XE Marketing Pages - Update links 
public class ID0006_RemoveRequestDemo {
	private String baseUrl;
	private WebDriver driver;
	private RemoveRequestDemo_UI demo;
	private General general;
	private String usedBrowser;
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		usedBrowser = browser;
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		demo =  PageFactory.initElements(driver, RemoveRequestDemo_UI.class);
		baseUrl = url;
		
	}

	@Test
    public void a_redirectToXeMt() throws InterruptedException {
	 
		//driver.get(baseUrl);
		general.openStartingPage(baseUrl, usedBrowser);
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"nz/",usedBrowser);
		checkrequestdemo("nz/");
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"au/",usedBrowser);
		checkrequestdemo("au/");
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"ca/",usedBrowser);
		checkrequestdemo("ca/");
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"us/",usedBrowser);
		checkrequestdemo("us/");
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"uk/",usedBrowser);
		checkrequestdemo("uk/");
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"business/", usedBrowser);
		checkrequestdemobusiness();
		general.openStartingPage(baseUrl+"xemoneytransfer/",usedBrowser);
		driver.findElement(By.cssSelector(".login")).click();
		String text1 = driver.getCurrentUrl();
		Assert.assertEquals(text1, "https://transfer.xe.com/account/login/home");
	}
	
	
	public void checkrequestdemo(String local)
	{
		driver.get(baseUrl+"xemoneytransfer/"+local+"/#whyxe/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+local+"/#howitworks/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+local+"/#currencies");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+local+"/#greatratesnofees/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+local+"/#trustedbrand/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+local+"/#securereliable/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		}
	

	public void checkrequestdemobusiness()
	{
		driver.get(baseUrl+"xemoneytransfer/"+"/#whyxe/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"/#features/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"/#howitworks/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"/#currencies");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"/#trustedbrand/");
	    Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"/#securereliable/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		}

	
	
	 @AfterClass
  	  public void close() {
  	  driver.close();
  	  }	
}

