package XeMt;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.General;
import xemt_UI.BusinessFirsttabs_UI;
import xemt_UI.PersonalLastTabs_UI;



public class ID0002_XeMtBusiness {

	
	private String baseUrl;
	private WebDriver  driver;
	private General general;
	private BusinessFirsttabs_UI home;
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefoxLocal")String browser) throws MalformedURLException, InterruptedException {	
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		home =  PageFactory.initElements(driver, BusinessFirsttabs_UI.class);
		baseUrl = "http://gamma.xe.com/";
		
		
	}
	
	
	  @Test
	  public void a_redirectToXeMt() throws InterruptedException {
			//C5953	check XEMT business page is navigating properly or not
		  driver.get(baseUrl);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(baseUrl+"xemoneytransfer/business/");
		  Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //	C5954	check the content for Why XE tab under the business function.
		  Thread.sleep(2000);
		  String text1 = home.pullLeft_UI.getText();
		  Assert.assertEquals(text1,"International Payments designed around your business.");
		  Thread.sleep(2000);
		  String text2=  home.pullLeftp_UI.get(0).getText();
		  Assert.assertEquals(text2,"Whether you're sending or receiving international payments, XE's business services have been designed to save you time and money. We offer businesses of all sizes, from large corporations to small start-ups, a unique mix of currency solutions, intuitive technology, and complete peace of mind.");
		  String text3=  home.pullLeftp_UI.get(1).getText();
		  Assert.assertEquals(text3,"Every year, over 2,000 businesses trust us to make global payments. At XE, we're passionate about saving you time and money while providing exceptional service and proud to be part of Euronet Worldwide, Inc. (NASDAQ: EEFT).");
		  String text4=  home.featureIconsSixItems_UI.get(0).getText();
		  Assert.assertEquals(text4,"Great rates");
		  String text5=  home.featureIconsSixItems_UI.get(1).getText();
		  Assert.assertEquals(text5,"Low fees");
		  String text6=  home.featureIconsSixItems_UI.get(2).getText();
		  Assert.assertEquals(text6,"Fast & easy");
		  String text7=  home.featureIconsSixItems_UI.get(3).getText();
		  Assert.assertEquals(text7,"Market professionals");
		  String text8=  home.featureIconsSixItems_UI.get(4).getText();
		  Assert.assertEquals(text8,"Secure");
		  String text9=  home.featureIconsSixItems_UI.get(5).getText();
		  Assert.assertEquals(text9,"FX tools");
		  String text10=  home.joinNow_UI.get(0).getText();
		  Assert.assertEquals(text10,"Join now and see how much your business can save:");
//			C5955	check the content for features tab under the business function 
		  driver.get(baseUrl+"xemoneytransfer/business/"+"#features");
		  Thread.sleep(2000);
		  String txt2=  home.heading_UI.get(1).getText();
		  Assert.assertEquals(txt2,"Easy to use and feature rich");
		  String txt5 =  home.featureIconsInlineclearfix_UI.get(6).getText();
		  Assert.assertEquals(txt5,"Great rates"+"\n"+"Competitive exchange rates and low fees with the ability to track and make payments online 24/7.");
		  String txt6 =  home.featureIconsInlineclearfix_UI.get(7).getText();
		  Assert.assertEquals(txt6,"Fast & easy"+"\n"+"Fast delivery of payments and receipts with notification alerts for you and your recipients.");
		  String txt7 =  home.featureIconsInlineclearfix_UI.get(8).getText();
		  Assert.assertEquals(txt7,"Market professionals"+"\n"+"Experts who'll act as your eyes and ears in the markets and tailor services for your business.");
		  String txt8 = home.featureIconsInlineclearfix_UI.get(9).getText();
		  Assert.assertEquals(txt8,"FX tools"+"\n"+"Email rate alerts and detailed charting to track exchange rate movements.");
		  String txt9 =  home.featureIconsInlineclearfix_UI.get(10).getText();
		  Assert.assertEquals(txt9,"Insights & information"+"\n"+"Live insights to help you make informed decisions for your trades and hedging strategies.");
		  String txt10 = home.featureIconsInlineclearfix_UI.get(11).getText();
		  Assert.assertEquals(txt10,"Flexible options"+"\n"+"A range of transaction options including forward contracts and market orders.");
		// C5956	check the content for Features tab under the business function
		  driver.get(baseUrl+"xemoneytransfer/business/"+"#howitworks");
		  Thread.sleep(2000);
		  String txt11 =  home.featureIconFourItems_UI.get(0).getText();
		  Assert.assertEquals(txt11,"Sign up"+"\n"+"Sign up for a free no obligation account and access our latest tools and information.");
		  String txt12 =  home.featureIconFourItems_UI.get(1).getText();
		  Assert.assertEquals(txt12,"Get a Quote"+"\n"+"Get a free quote and see how competitive our rates are before you commit.");
		  String txt13 =  home.featureIconFourItems_UI.get(2).getText();
		  Assert.assertEquals(txt13,"Send"+"\n"+"Select your currencies and beneficiaries and pay by bank transfer.");
		  String txt14 =  home.featureIconFourItems_UI.get(3).getText();
		  Assert.assertEquals(txt14,"Track"+"\n"+"You'll have visibility at each step and you will be alerted when funds are delivered.");
		  
		 
}
	  @AfterClass
	  public void close() {
	  driver.close();
	  }	
	}
