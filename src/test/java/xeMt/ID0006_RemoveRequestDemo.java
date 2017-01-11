package xeMt;

import org.testng.annotations.Test;

import utils.Browsers;
import utils.General;
import xemt_UI.RemoveRequestDemo_UI;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

//	C7616	XE Money Transfer - Remove "Request a Demo"  
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
		checkrequestdemonz();
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"au/",usedBrowser);
		checkrequestdemoau();
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"ca/",usedBrowser);
		checkrequestdemoca();
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"us/",usedBrowser);
		checkrequestdemous();
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"uk/",usedBrowser);
		checkrequestdemouk();
		general.openStartingPage(baseUrl+"xemoneytransfer/"+"business/", usedBrowser);
		checkrequestdemobusiness();
		
	}
	
	
	public void checkrequestdemonz()
	{
		driver.get(baseUrl+"xemoneytransfer/"+"nz/"+"/#whyxe/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"nz/"+"/#howitworks/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"nz/"+"/#currencies");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"nz/"+"/#greatratesnofees/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"nz/"+"/#trustedbrand/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"nz/"+"/#securereliable/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		}
	
	public void checkrequestdemoau()
	{
		driver.get(baseUrl+"xemoneytransfer/"+"au/"+"/#whyxe/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"au/"+"/#howitworks/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"au/"+"/#currencies");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"au/"+"/#greatratesnofees/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"au/"+"/#trustedbrand/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"au/"+"/#securereliable/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		}
	
	public void checkrequestdemoca()
	{
		driver.get(baseUrl+"xemoneytransfer/"+"ca/"+"/#whyxe/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"ca/"+"/#howitworks/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"ca/"+"/#currencies");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"ca/"+"/#greatratesnofees/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"ca/"+"/#trustedbrand/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"ca/"+"/#securereliable/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		}
	
	public void checkrequestdemous()
	{
		driver.get(baseUrl+"xemoneytransfer/"+"us/"+"/#whyxe/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"us/"+"/#howitworks/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"us/"+"/#currencies");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"us/"+"/#greatratesnofees/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"us/"+"/#trustedbrand/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"us/"+"/#securereliable/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		}
	
	public void checkrequestdemouk()
	{
		driver.get(baseUrl+"xemoneytransfer/"+"uk/"+"/#whyxe/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"uk/"+"/#howitworks/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"uk/"+"/#currencies");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"uk/"+"/#greatratesnofees/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"uk/"+"/#trustedbrand/");
		Assert.assertFalse(driver.getPageSource().contains("Request Demo"));
		driver.get(baseUrl+"xemoneytransfer/"+"uk/"+"/#securereliable/");
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

