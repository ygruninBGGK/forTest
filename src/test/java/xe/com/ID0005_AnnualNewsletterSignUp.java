package xe.com;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.General;
import xecom_UI.AnnualNewsLetter_UI;

public class ID0005_AnnualNewsletterSignUp {

	private String baseUrl;
	private WebDriver driver;
	private AnnualNewsLetter_UI letter;
	private General general;
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefoxLocal")String browser) throws MalformedURLException, InterruptedException {	
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		letter =  PageFactory.initElements(driver, AnnualNewsLetter_UI.class);
		baseUrl = url;
}
	 @Test
     public void a_redirectToXeMt() throws InterruptedException {
	 
       driver.get(baseUrl+"email/xenewsletter/");
       driver.manage().window().setSize(new Dimension(1920, 1080));
       String text1 =   letter.heading_UI.getText();
	   Assert.assertEquals(text1,"XE Newsletter");
	   String text2 =   letter.description_UI.getText();
	   Assert.assertEquals(text2,"XE Company Newsletter Subscription"+"\n"+"Here at XE, we're always up to something new. Keep up-to-date with all our XE events, products, and services by subscribing to our Company Newsletter. You can also check out our past newsletters below.");
	   String text3 =   letter.formHeading_UI.getText();
	   Assert.assertEquals(text3,"Subscribe");
	   Thread.sleep(2000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;  // Scroll down the webpage
	   jse.executeScript("window.scrollBy(0,250)", "");
	   driver.findElement(By.cssSelector("[value='Subscribe ►']")).click();
	   String text4 =   letter.Required_UI.getText();
	   Assert.assertEquals(text4,"* Required Field or Invalid Input");
	   String text5 =   letter.errorMessage_UI.get(1).getText();
	   Assert.assertEquals(text5,"* Please enter name.");
	   String text6 =   letter.errorMessage_UI.get(2).getText();
	   Assert.assertEquals(text6,"* Please enter name.");
	   String text7 =   letter.errorMessage_UI.get(3).getText();
	   Assert.assertEquals(text7,"* Please enter email.");
	   String text8 =   letter.errorMessage_UI.get(4).getText();
	   Assert.assertEquals(text8,"* Please select a country");
	   driver.findElement(By.name("firstname")).sendKeys("abc");
	   driver.findElement(By.name("lastname")).sendKeys("dgas");
	   driver.findElement(By.name("email")).sendKeys("abc@abc.com");
	   Select dropdown = new Select(driver.findElement(By.id("country")));
	   dropdown.selectByVisibleText("Canada");
	   Select dropdown1 = new Select(driver.findElement(By.id("useXEComFor")));
	   dropdown1.selectByVisibleText("Both");
	   Select dropdown2 = new Select(driver.findElement(By.id("useXERatesFor")));
	   dropdown2.selectByVisibleText("Other");
	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	   jse1.executeScript("window.scrollBy(0,250)", "");
	   driver.findElement(By.cssSelector("[value='Subscribe ►']")).click();
}

	 @AfterClass
  	  public void close() {
  	  driver.close();
  	  }	
}


