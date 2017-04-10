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
		//Faq();
		//logout();
		
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
//
//	// Logout paragraphs
//	public void logout() throws InterruptedException {
//		page.navigation_UI.get(1).click();
//		Thread.sleep(2000);
//		String text14 = page.logoutparagraphs_UI.get(0).getText();
//		Assert.assertEquals(text14,"Great personalized Rate Alerts to monitor your currency pairs");
//		Thread.sleep(2000);
//		String text15 = page.logoutparagraphs_UI.get(1).getText();
//		Assert.assertEquals(text15,"When your currency pair reaches your desired rate, we will send you an email alert. Download our XE Currency app to receive alerts on your phone.");
//		String text18 = page.logoutparagraphs_UI.get(2).getText();
//		Assert.assertEquals(text18,"XE Rate Alerts use mid-market rates. To set a rate alert with transactional rates, log in or sign up to XE Money Transfer. It's easy, secure, and offers great rates. Start Now ►");
//	}
//
//	// Faq
//	public void Faq() throws InterruptedException {
//		
//		page.navigation_UI.get(0).click();
//		String text19 = page.faq_UI.getText();
//		Assert.assertEquals(text19, "Frequently Asked Questions");
//		String text20 = page.faqparagraph_UI.getText();
//		Assert.assertEquals(text20, "These are the most frequently asked questions about our XE Rate Alerts Service.");
//		// question1
//		String text21 = page.questionlist_UI.get(0).getText();
//		Assert.assertEquals(text21, "What are mid-market rates?");
//		page.questionlist_UI.get(0).click();
//		String text22 = page.answerparagraph_UI.get(0).getText();
//		Assert.assertEquals(text22,"Mid-market rates are derived from the mid-point between the \"buy\" and \"sell\" rates from global currency markets. We use mid-market rates for our free information services since it indicates the value of a currency that is not weighted towards either buying or selling.");
//		Thread.sleep(2000);
//		String text23 = page.answerparagraph_UI.get(1).getText();
//		Assert.assertEquals(text23,"\"Buy\" and \"sell\" rates include overhead and profit margins that are independently set by foreign exchange providers; their rates can vary and will differ from the mid-market rate. You can check out our XE Money Transfer service for no-fee currency transfer options.");
//		// question2
//		String text24 = page.questionlist_UI.get(1).getText();
//		Assert.assertEquals(text24, "What is a Rate Alert?");
//		page.questionlist_UI.get(1).click();
//		String text32 = page.answer_UI.get(1).getText();
//		Assert.assertEquals(text32,"Our XE Rate Alert allows you to create an exchange rate alert for the currency pairing of your choice (for example: US Dollar to Euro). This alert will trigger (either by email or through our app notification, depending upon your sign-up selection) when the selected currency pairs reach your set exchange rate.");
//		// question 3
//		String text25 = page.questionlist_UI.get(2).getText();
//		Assert.assertEquals(text25, "I compared your rates to the other rates and they don't match. Why?");
//		page.questionlist_UI.get(2).click();
//		String text26 = page.answerparagraph_UI.get(2).getText();
//		Assert.assertEquals(text26,"There are many currency markets all over the world and specific rates will vary from market to market. Our sources are global, which means that data for a currency can be updated even when the markets of its home country are closed. For example, prices in the New York and London metal exchanges generally follow each other, but are very seldom exactly the same.");
//		Thread.sleep(2000);
//		String text27 = page.answerparagraph_UI.get(3).getText();
//		Assert.assertEquals(text27,"You may also be comparing our mid-market rates to your foreign exchange provider's \"buy\" and \"sell\" rates which include overhead and profit margins. We do offer “buy” and “sell” rates through our XE Money Transfer service.");
//		// question4
//		String text28 = page.questionlist_UI.get(3).getText();
//		Assert.assertEquals(text28, "How can I get historical currency rates?");
//		page.questionlist_UI.get(3).click();
//		String text29 = page.answer_UI.get(3).getText();
//		Assert.assertEquals(text29, "Historical currency rates can be found through our Interactive Currency Table");
//		// question5
//		String text30 = page.questionlist_UI.get(4).getText();
//		Assert.assertEquals(text30, "Where do you get your currency rates?");
//		page.questionlist_UI.get(4).click();
//		Thread.sleep(2000);
//		String text31 = page.answerparagraph_UI.get(4).getText();
//		Assert.assertEquals(text31,"We use live, real-time rate feeds from global forex markets which means rates can be updated even when a country's markets are closed. If a currency is not regularly traded, we use the most recent data available. Our advanced systems factor in data from a wide variety of sources and automatically corrects errors.");
//		Thread.sleep(2000);
//		String text33 = page.answerparagraph_UI.get(5).getText();
//		Assert.assertEquals(text33,"Note: If you need data for commercial purposes, read about our XE Currency Data API.");
	//}

	@AfterClass
	public void close() {
		driver.close();
	}
}