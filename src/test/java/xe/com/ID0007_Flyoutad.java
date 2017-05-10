package xe.com;

import java.net.MalformedURLException;

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
import xecom_UI.flyoutAd_UI;

public class ID0007_Flyoutad {
	private String baseUrl;
	private WebDriver driver;
	private flyoutAd_UI page;
	private General general;
	private String usedBrowser;

	@Parameters({ "BaseUrl", "browser" })
	@BeforeClass
	public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefoxLocal") String browser)
			throws MalformedURLException, InterruptedException {
		//usedBrowser = browser;
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		page = PageFactory.initElements(driver, flyoutAd_UI.class);
		baseUrl = url;
}
	@Test
	public void flyoutad() throws InterruptedException{
		
		driver.get(baseUrl);
		page.rate_UI.get(2).click();
		page.moneytransferad_UI.click();
		String txt15 = driver.getCurrentUrl();
		Assert.assertEquals(txt15,"http://www.xe.com/xemoneytransfer/ca/");
		driver.get(baseUrl);
		page.rate_UI.get(2).click();
		String text1 =   page.chartdata_UI.getAttribute("style");
		Assert.assertTrue(text1.contains("/gen/charts/images/large/EURUSD.png?"));
		page.inverse_UI.click();
		String text2 =   page.chartdata_UI.getAttribute("style");
		Assert.assertTrue(text2.contains("/gen/charts/images/large/USDEUR.png?"));
		page.information_UI.click();
		String text3 =   page.popuptitle_UI.getText();
		Assert.assertEquals(text3, "Chart Information"+"\n"+"This chart represents the last 24 hours for this currency pair. To see an inverse rate, click the button above.");
		page.chartbutton_UI.click();
		String text4 = driver.getCurrentUrl();
		Assert.assertEquals(text4, "http://gamma.xe.com/currencycharts/?from=EUR&to=USD");
		String text5 = page.chartheading_UI.getText();
		Assert.assertEquals(text5,"XE Currency Charts: EUR to USD");
		String text6 = page.subheading_UI.get(0).getText();
		Assert.assertEquals(text6,"Euro to US Dollar Chart");
		String text7 = page.description_UI.getText();
		Assert.assertEquals(text7,"This EUR/USD Chart lets you see this pair's currency rate history for up to 10 years! XE uses highly accurate, live mid-market rates.");
		
	
	}
	
	@AfterClass
	public void close() {	
		driver.close();
	}
}
