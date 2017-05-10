package XERA;

import org.testng.annotations.Test;

import XERA_UI.LoginPageXera_UI;
import utils.Browsers;
import utils.General;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	public void BaseUrl(@Optional("https://xera.xedevelopment.com") String url,
			@Optional("firefoxLocal") String browser) throws MalformedURLException, InterruptedException {
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		page = PageFactory.initElements(driver, LoginPageXera_UI.class);
		baseUrl = url;

	}

	@Test
	public void loginpage() throws InterruptedException {

		// login page - error messages
		driver.get(baseUrl);
		page.login_UI.click();
		String text1 = page.error_UI.get(0).getText();
		Assert.assertEquals(text1, "E-mail field is required.");
		String text2 = page.error_UI.get(1).getText();
		Assert.assertEquals(text2, "Password field is required.");

		// sign up page
		page.register_UI.click();
		String text3 = driver.getCurrentUrl();
		Assert.assertEquals(text3, "https://xera.xedevelopment.com/signup.php");
		String text10 = page.heading_UI.getText();
		Assert.assertEquals(text10, "XE Rate Alerts (Beta)");
		String text4 = page.signup_UI.getText();
		Assert.assertEquals(text4, "Sign up for free to access premium XE services.");
		page.create_UI.click();
		general.wait10sec();
		String text5 = page.required_UI.getText();
		Assert.assertEquals(text5, "Required");
		String text6 = page.password_UI.getText();
		Assert.assertEquals(text6, "Required");
		String text7 = page.repassword_UI.getText();
		Assert.assertEquals(text7, "Required");
		page.enterEmail("naga.sindhu@xe.com");
		page.enterpassword("abcd1234");
		page.enterpasswordconfirm("abcd1234");
		page.create_UI.click();
		String text9 = page.emailexist_UI.getText();
		Assert.assertEquals(text9, "This email address has already been registered. Click here to login.");

		// Login - existing user
		driver.get(baseUrl);
		page.fillEmail("sindhu.vallabhaneni42@gmail.com");
		page.fillPassword("abcd1234");
		page.login_UI.click();
		String text8 = driver.getCurrentUrl();
		Assert.assertEquals(text8, "https://xera.xedevelopment.com/");
		page.navigation_UI.get(1).click();
				
		// Login - non registered user
		driver.get(baseUrl);
		page.fillEmail("sindhu.vall@gmail.com");
		page.login_UI.click();
		String text20 = page.error_UI.get(0).getText();
		Assert.assertEquals(text20, "Password field is required.");
		page.fillPassword("abcd1234");
		page.login_UI.click();
		String text21 = page.errormessge_UI.get(0).getText();
		Assert.assertEquals(text21, "Error message"+"\n"+"Sorry, unrecognized username or password. Have you forgotten your password?");
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
}