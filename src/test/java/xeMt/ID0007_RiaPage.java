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
		Assert.assertEquals(txt01, "Meet XE's Sister Company:"+"\n"+"Ria Money Transfer");
		String txt10 = page.whoIsRiaparagraph_UI.getText();
		Assert.assertEquals(txt10, "Like XE, Ria is a part of Euronet Worldwide, a trusted global leader in electronic financial transactions. With over 25 years of experience, you'll find sending money with Ria is not only fast, but secure too.");
		Thread.sleep(2000);
		String text12= page.trustedcontent_UI.getText();
		Assert.assertEquals(text12, "Trusted Money Transfer Experts");
		String text13= page.trustedcontentparagraph_UI.getText();
		Assert.assertEquals(text13, "We're growing! With over 317,000 locations in 146 countries, we're constantly optimizing our services to make sending easier than ever.");
		
		String text4= page.featureIcons_UI.get(0).getText();
		Assert.assertEquals(text4, "Budget-friendly"+"\n"+"Low fees and great rates, no matter where you’re sending");
		String text5= page.featureIcons_UI.get(1).getText();
		Assert.assertEquals(text5, "Hassle-free"+"\n"+"Easily send money to over 146 countries, no matter where you are");
		String text6= page.featureIcons_UI.get(2).getText();
		Assert.assertEquals(text6, "Safe & Secure"+"\n"+"We work around the clock to ensure your money arrives quickly and safely, no matter what.");
		page.sendmoneybutton_UI.get(0).click();
		general.wait10sec();
		sendmoney(); 
		general.wait10sec();
		driver.get(baseUrl+"riamoneytransfer");
	    page.sendmoneybutton_UI.get(1).click();
	    sendmoney();
	    
	    
	    
	    
	}
	
	public void sendmoney() throws InterruptedException {
    	general.wait10sec();		
		String txt14 = page.container_UI.getText();
		Assert.assertEquals(txt14, "We're sorry, registration is not yet available in your country");
		String txt15 = page.containerParagraph_UI.get(0).getText();
		Assert.assertEquals(txt15, "Currently, only users in the US and Spain may send money (and Australia coming soon!) However, you can still receive money in 146 countries around the world.");
		}
	@AfterClass

	public void close() {
		driver.close();
	}
	}

