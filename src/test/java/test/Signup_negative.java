package test;

import java.net.MalformedURLException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.General;
import utils.GettingStarted_UI;
import utils.HomePage_UI;




//C5256	check the following links and make sure references to beta removed. 1. http://www.xe.com/sitemap.php 2. http://www.xe.com/tools.php 
//C5255	verify- http://www.xe.com/beta/ is removed or not
//C5370	Migration - FAQ - Add new question and answer 

public class Signup_negative {

	private String baseUrl;
	private WebDriver driver;
    private General general;
    private HomePage_UI homepage;
    private GettingStarted_UI get;
    
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("https://www.goodreads.com/") String url, @Optional("firefoxLocal") String browser) throws MalformedURLException, InterruptedException {
		driver = Browsers.getDriver(browser);
		homepage = PageFactory.initElements(driver, HomePage_UI.class);
		get = PageFactory.initElements(driver, GettingStarted_UI.class);
		baseUrl = url;
	}

		
  @Test
  public void a_signup(){
	  
	  // open the home page and fill first need info for signeup
	  driver.get(baseUrl);
	  driver.manage().window().setSize(new Dimension(1920, 1080));
	  homepage.name_UI.sendKeys("");
	  homepage.email_UI.sendKeys("");
	  homepage.pwd_UI.sendKeys("");
	  homepage.btn_UI.click();
	  
	  Assert.assertEquals(homepage.error_UI.getText(),"Sorry, you must enter a name to sign up for Goodreads.");
	 }
  
  
  
 
	@AfterClass
	public void close() {
		driver.close();
	}

}
