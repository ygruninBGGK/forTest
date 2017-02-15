package XERA;
import org.testng.annotations.Test;

import XERA_UI.LoginPageXera_UI;
import utils.Browsers;
import utils.General;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class ID0001_LoginPageXera {
	private String baseUrl;
	private WebDriver driver;
	private General general;
	private LoginPageXera_UI page;


	@Parameters({ "BaseUrl", "browser" })
	@BeforeClass
	public void BaseUrl(@Optional("https://xera.xedevelopment.com/") String url, @Optional("safariLocal") String browser) throws MalformedURLException, InterruptedException {
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		page = PageFactory.initElements(driver, LoginPageXera_UI.class);
		baseUrl = url;
		
}
	@Test
	public void loginpage() throws InterruptedException{
		//login page
		driver.get(baseUrl);
		page.login_UI.click();
		String text1 =  page.error_UI.get(0).getText();
		Assert.assertEquals(text1,"E-mail field is required.");
		String text2 =  page.error_UI.get(1).getText();
		Assert.assertEquals(text2,"Password field is required.");
		page.fillEmail("sindhu.vallabhaneni42@gmail.com");
		page.fillPassword("a1b2c3d4");
		page.login_UI.click();
		String text8 = driver.getCurrentUrl();
		Assert.assertEquals(text8, "https://xera.xedevelopment.com/");
		page.creatalert_UI.click();
		String text9 = driver.getCurrentUrl();
		Assert.assertEquals(text9, "https://xera.xedevelopment.com/alert/create.php");
		Thread.sleep(2000);
		page.fillfromAmount("1");
		page.filltoAmount("66");
		page.fillfromCurrency("USD");
		page.filltoCurrency("INR");
		driver.findElement(By.name("name")).sendKeys("sindhu.vallabhaneni42@gmail.com");
		//driver.findElement(By.id("fromAmount")).sendKeys("1");
		//driver.findElement(By.id("toAmount")).sendKeys("66");
		//driver.findElement(By.id("from")).sendKeys("USD");
		//driver.findElement(By.id("to")).sendKeys("INR");
		page.alertmessage_UI.click();
		
		//sign up page 
		driver.get(baseUrl);
		page.register_UI.click();
		String text3 = driver.getCurrentUrl();
		Assert.assertEquals(text3, "https://xera.xedevelopment.com/signup.php");
		page.submit_UI.click();
		String text4 = page.signup_UI.getText();
		Assert.assertEquals(text4, "Sign up for free to access premium XE services.");
		page.create_UI.click();
		Thread.sleep(2000);
		String text5 = page.required_UI.getText();
		Assert.assertEquals(text5, "Required");
		String text6 = page.password_UI.getText();
		Assert.assertEquals(text6, "Required");
		String text7 = page.repassword_UI.getText();
		Assert.assertEquals(text7, "Required");
		
	}
	

@AfterClass
	  public void close() {
	  driver.close();
	  }	
}