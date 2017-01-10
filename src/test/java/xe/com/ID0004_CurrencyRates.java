package xe.com;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utils.Browsers;
import utils.General;

public class ID0004_CurrencyRates {

		private String baseUrl;
		private WebDriver driver;
		private General general;
		@Parameters({"BaseUrl","browser"})
	    @BeforeClass
	    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
			driver = Browsers.getDriver(browser);
			general = PageFactory.initElements(driver, General.class);
			baseUrl = url;
}
		public void currenyrates()
		{
			driver.get(baseUrl);
		}
}
