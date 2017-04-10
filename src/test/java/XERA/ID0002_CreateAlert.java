package XERA;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import XERA_UI.LoginPageXera_UI;
import utils.Browsers;
import utils.General;

public class ID0002_CreateAlert {
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
	public void createdeleteedit() throws InterruptedException {

		// Login
		driver.get(baseUrl);
		page.fillEmail("sindhu.vallabhaneni42@gmail.com");
		page.fillPassword("abcd1234");
		page.login_UI.click();
		String text8 = driver.getCurrentUrl();
		Assert.assertEquals(text8, "https://xera.xedevelopment.com/");
		
		// Empty list message
		general.wait10sec();
		String text12 = page.emptylist_UI.getText();
		Assert.assertEquals(text12,"Create a rate alert for your preferred currency pairs. We’ll monitor the market so you don’t have to.");
		String text13 = page.tipmessage_UI.getText();
		Assert.assertEquals(text13,"XE Rate Alerts uses mid-market rates. They are derived from the mid-point between the buy and sell rates from global currency markets. Your foreign exchange provider’s rates may differ.");
		
		// Creating alert - new user(first alert)
		createalert();
		delete();
		
		// create alert - existing user
//		driver.get(baseUrl);
//		page.fillEmail("sindhu.vallabhaneni42@gmail.com");
//		page.fillPassword("abcd1234");
//		page.login_UI.click();
//		String text35 = driver.getCurrentUrl();
//		Assert.assertEquals(text35, "https://xera.xedevelopment.com/");
		createalert();
		page.creatalert_UI.click();
		String text11 = driver.getCurrentUrl();
		Assert.assertEquals(text11, "https://xera.xedevelopment.com/alert/create.php");
		page.fillfromAmount("1");
		page.autocomplete_UI.get(0).click();
		page.fillfromCurrency("USD");
		driver.findElements(By.cssSelector("#from_scroller li")).get(0).click();
		page.autocomplete_UI.get(1).click();
		page.filltoCurrency("INR");
		Thread.sleep(2000); // These waits are necessary
		driver.findElements(By.cssSelector("#to_scroller li")).get(0).click();
		Thread.sleep(2000); //// These waits are necessary
		page.createalert_UI.click();
		
		//edit alert
		page.edit_UI.click();
		page.autocomplete_UI.get(0).click();
		page.fillfromCurrency("AMD");
		driver.findElements(By.cssSelector("#from_scroller li")).get(0).click();
		page.autocomplete_UI.get(1).click();
		page.filltoCurrency("AUD");
		Thread.sleep(2000); // These waits are necessary
		driver.findElements(By.cssSelector("#to_scroller li")).get(0).click();
		Thread.sleep(2000); //// These waits are necessary
		page.createalert_UI.click();
		page.del_UI.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		page.returntolist_UI.click();
		delete();
		
		
		
	}

	public void createalert() throws InterruptedException {
		page.creatalert_UI.click();
		String text11 = driver.getCurrentUrl();
		Assert.assertEquals(text11, "https://xera.xedevelopment.com/alert/create.php");
		general.wait10sec();
		page.fillfromAmount("1");
		page.autocomplete_UI.get(0).click();
		page.fillfromCurrency("EUR");
		driver.findElements(By.cssSelector("#from_scroller li")).get(0).click();
		general.wait10sec();
		page.autocomplete_UI.get(1).click();
		page.filltoCurrency("INR");
		Thread.sleep(2000);    // These waits are necessary
		driver.findElements(By.cssSelector("#to_scroller li")).get(0).click();
		Thread.sleep(2000);    //These waits are necessary
		page.createalert_UI.click();
		page.returntolist_UI.click();
		
	}
	

	// delete - alert
	public void delete() throws InterruptedException {
	
		for (WebElement alertItem : page.alertlistdelete_UI) {
			page.delete_UI.click();
			Thread.sleep(2000);
			alertItem.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
	}
		
	@AfterClass
	public void close() {
		driver.close();
	}
	
	}
