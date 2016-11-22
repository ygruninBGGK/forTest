package XeMt;

import java.net.MalformedURLException;
import java.util.List;
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
import utils.Browsers;
import utils.General;
import xemt_UI.Businessenquiry_UI;

public class ID0003_XemtBusinessenquiry {

	private String baseUrl;
	private WebDriver driver;
	private Businessenquiry_UI enquiry;


	// C6164 XE Marketing Pages - Develop business inquiry form
	@Parameters({ "BaseUrl", "browser" })
	@BeforeClass
	public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefoxLocal") String browser) throws MalformedURLException, InterruptedException {
		driver = Browsers.getDriver(browser);
		enquiry = PageFactory.initElements(driver, Businessenquiry_UI.class);
		baseUrl = url;
	}

	@Test
	public void a_redirectToXeMt() throws InterruptedException {

		driver.get(baseUrl + "xemoneytransfer/business/");
		List<WebElement> p = driver.findElements(By.cssSelector(".button.large.green.roundedCorners"));
		p.get(0).click();
		driver.findElement(By.cssSelector(".button.medium.over1m.green.inline.roundedCorners")).click();
		String text1 = enquiry.moduleHeading_UI.getText();
		Assert.assertEquals(text1, "Business Account Enquiry");
		String text2 = enquiry.moduleParagraph_UI.getText();
		Assert.assertEquals(text2,"Please provide the following information and our dedicated team will contact you to discuss your individual business needs.");
		String text15 = enquiry.footer_UI.getText();
		Assert.assertEquals(text15, "If you require immediate help, please contact us here.");
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		String text3 = enquiry.errorFirstname_UI.getText();
		Assert.assertEquals(text3, "Please enter your first name.");
		String text4 = enquiry.errorLastname_UI.getText();
		Assert.assertEquals(text4, "Please enter your last name.");
		String text5 = enquiry.errorBusinessname_UI.getText();
		Assert.assertEquals(text5, "Please enter your business name.");
		String text6 = enquiry.address_UI.getText();
		Assert.assertEquals(text6, "Please enter your business address.");
		String text7 = enquiry.phone_UI.getText();
		Assert.assertEquals(text7, "Please enter your phone number.");
		String text8 = enquiry.email_UI.getText();
		Assert.assertEquals(text8, "Please enter your email address.");
		String text9 = enquiry.currenciesBought_UI.getText();
		Assert.assertEquals(text9, "Please enter your currencies bought.");
		String text10 = enquiry.currenciesSold_UI.getText();
		Assert.assertEquals(text10, "Please enter your currencies sold.");
		String text11 = enquiry.turnover_UI.getText();
		Assert.assertEquals(text11, "Please enter your estimated turnover.");
		String text12 = enquiry.reasons_UI.getText();
		Assert.assertEquals(text12, "Please enter your reasons for transactions.");
		driver.get(baseUrl + "xemoneytransfer/business/");
		List<WebElement> p1 = driver.findElements(By.cssSelector(".button.large.green.roundedCorners"));
		p1.get(0).click();
		driver.findElement(By.cssSelector(".button.medium.over1m.green.inline.roundedCorners")).click();
		driver.findElement(By.name("firstName")).sendKeys("abc");
		driver.findElement(By.name("lastName")).sendKeys("abc");
		driver.findElement(By.name("businessName")).sendKeys("abc");
		driver.findElement(By.name("address")).sendKeys("abc");
		driver.findElement(By.name("phone")).sendKeys("sfc");
		driver.findElement(By.name("email")).sendKeys("abc@abc.com");
		driver.findElement(By.name("currenciesBought")).sendKeys("abc");
		driver.findElement(By.name("currenciesSold")).sendKeys("fmf");
		driver.findElement(By.name("turnover")).sendKeys("ggg");
		driver.findElement(By.name("reasons")).sendKeys("ggg");
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		String text13 = enquiry.thankyou_UI.getText();
		Assert.assertEquals(text13, "Thank you for contacting XE");
		String text14 = enquiry.message_UI.getText();
		Assert.assertEquals(text14,"Your message has been sent and our dedicated team will contact you to discuss your individual business needs.");
	}

	@AfterClass
	public void close() {
		driver.close();
	}
}
