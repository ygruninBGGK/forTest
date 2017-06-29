package utils;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import klipPages.Dashboard_UI;
import klipPages.Login_UI;



public abstract class ParentsTest {

		// Initialize the variables
	    protected String baseUrl;
	    protected String usedbrowser;
	    protected General general;
	    protected WebDriver driver;
	    protected Login_UI login;
	    protected Dashboard_UI dash;
	   
    
    
 // Initiate the browser and PageFactory
    @Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("https://app.klipfolio.com/login") String url, @Optional("firefoxLocal")String browser) throws MalformedURLException {
		usedbrowser = browser;
		driver = Browsers.getDriver(browser);
		baseUrl = url;
		general = PageFactory.initElements(driver, General.class);
		login = PageFactory.initElements(driver, Login_UI.class);
		dash = PageFactory.initElements(driver, Dashboard_UI.class);
    }
	

   
   // close the browser
   @AfterClass
   public void closeTheBrowser() throws InterruptedException {    
		System.out.println("Test case finished successfully. Closing the browser...");
		  general.close();
   }
}
