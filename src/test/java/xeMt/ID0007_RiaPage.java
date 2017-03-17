package xeMt;

import java.net.MalformedURLException;
import java.util.List;
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
import xemt_UI.RiaProductpage_UI;

//C9873	Ria Product Page
//C10554	Add 'Learn More' link to the Ria page
public class ID0007_RiaPage {
	private String baseUrl;
	private WebDriver driver;
	private RiaProductpage_UI page;
	private General general;
	private String usedBrowser;

	@Parameters({ "BaseUrl", "browser" })
	@BeforeClass
	public void BaseUrl(@Optional("http://www.xe.com/") String url, @Optional("firefoxLocal") String browser)
			throws MalformedURLException, InterruptedException {
		//usedBrowser = browser;
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		page = PageFactory.initElements(driver, RiaProductpage_UI.class);
		baseUrl = url;
}
	@Test
	public void riapage() throws InterruptedException{
		
		//general.openStartingPage(baseUrl+"riamoneytransfer", usedBrowser);
		driver.get(baseUrl+"riamoneytransfer");
		String txt01 = page.mainContent_UI.getText();
		Assert.assertEquals(txt01, "Meet XE's Sister Company: Ria Money Transfer");
		String txt02 = page.riaParagraph_UI.getText();
		Assert.assertEquals(txt02, "Need to send money to friends and loved ones across the globe? Ria has you covered.");
		String text03 = page.featureList_UI.get(0).getText();
		Assert.assertEquals(text03, "International and US-to-US sending");
		String text04 = page.featureList_UI.get(1).getText();
		Assert.assertEquals(text04, "Worldwide network of more than 314,000 locations in 144 countries");
		String text8 = page.featureList_UI.get(2).getText();
		Assert.assertEquals(text8, "Convenient payout options, including cash payouts");
		String txt09 = page.whoIsRia_UI.getText();
		Assert.assertEquals(txt09, "Who is Ria?");
		String txt10 = page.whoIsRiaparagraph_UI.getText();
		Assert.assertEquals(txt10, "Like XE, Ria is a part of Euronet Worldwide, a trusted global leader in electronic financial transactions. With over 25 years of experience, you'll find sending money with Ria is not only fast, but secure too.");
		Thread.sleep(2000);
		String text4= page.featureIcons_UI.get(0).getText();
		Assert.assertEquals(text4, "Great rates");
		String text5= page.featureIcons_UI.get(1).getText();
		Assert.assertEquals(text5, "Low fees");
		String text6= page.featureIcons_UI.get(2).getText();
		Assert.assertEquals(text6, "Fast & easy");
		String text7= page.featureIcons_UI.get(3).getText();
		Assert.assertEquals(text7, "Secure");
		String txt11 = page.footNote_UI.getText();
		Assert.assertEquals(txt11, "*Amazon.com is not a sponsor of this promotion. Except as required by law, Amazon.com Gift Cards (\"GCs\") cannot be transferred for value or redeemed for cash. GCs may be used only for purchases of eligible goods on Amazon.com or certain of its affiliated websites. GCs cannot be redeemed for purchases of gift cards. Purchases are deducted from the GC balance. To redeem or view a GC balance, visit \"Your Account\" on Amazon.com. Amazon is not responsible if a GC is lost, stolen, destroyed or used without permission. For complete terms and conditions, see www.amazon.com/gc-legal. GCs are issued by ACI Gift Cards, Inc., a Washington corporation. All Amazon ®, ™ & © are IP of Amazon.com, Inc. or its affiliates. No expiration date or service fees.");
		String txt12 = page.logoContainer_UI.get(0).getText();
		Assert.assertEquals(txt12, "New customers get a $10 Amazon.com gift card*");
		String txt13 = page.logoContainer_UI.get(1).getText();
		Assert.assertEquals(txt13, "Learn More");
		page.greenButton_UI.click();
		String txt14 = page.container_UI.getText();
		Assert.assertEquals(txt14, "We're sorry, registration is not yet available in your country");
		String txt15 = page.containerParagraph_UI.get(0).getText();
		Assert.assertEquals(txt15, "Currently, only users in the US and Spain may send money (and Australia coming soon!) However, you can still receive money in 146 countries around the world.");
		String txt16 = page.containerParagraph_UI.get(1).getText();
		Assert.assertEquals(txt16, "To be notified when our money transfer service will be available in your country, please enter your email address below.");
	}
	@AfterClass

	public void close() {
		driver.close();
	}
	}

