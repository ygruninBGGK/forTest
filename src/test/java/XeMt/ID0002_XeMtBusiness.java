package XeMt;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ID0002_XeMtBusiness {

	
	private String baseUrl;
	private FirefoxDriver driver;

	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://mlo04.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = new FirefoxDriver();
		baseUrl = "http://mlo01.xe.com/";
		
		
	}
	
	
	  @Test
	  public void a_redirectToXeMt() {
			//C5953	check XEMT business page is navigating properly or not
		  driver.get(baseUrl);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(baseUrl+"xemoneytransfer/business/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //	C5954	check the content for Why XE tab under the business function.
		  String text1 = driver.findElement(By.cssSelector(".pull-left h1")).getText();
		  Assert.assertEquals(text1,"International Payments designed around your business.");
		  List<WebElement> p = driver.findElements(By.cssSelector(".pull-left p")) ;
		  String text2=  p.get(0).getText();
		  Assert.assertEquals(text2,"Whether you're sending or receiving international payments, XE's business services have been designed to save you time and money. We offer businesses of all sizes, from large corporations to small start-ups, a unique mix of currency solutions, intuitive technology, and complete peace of mind.");
		  String text3=  p.get(1).getText();
		  Assert.assertEquals(text3,"Every year, over 2,000 businesses trust us to make global payments. At XE, we're passionate about saving you money while providing exceptional service and proud to be part of Euronet Worldwide, Inc. (NASDAQ: EEFT).");
		  
		  List<WebElement> p1 = driver.findElements(By.cssSelector(".featureIcons.inline.sixItems.clearfix li"));
		  String text4=  p1.get(0).getText();
		  Assert.assertEquals(text4,"Great rates");
		  String text5=  p1.get(1).getText();
		  Assert.assertEquals(text5,"Low fees");
		  String text6=  p1.get(2).getText();
		  Assert.assertEquals(text6,"Fast & easy");
		  String text7=  p1.get(3).getText();
		  Assert.assertEquals(text7,"Market professionals");
		  String text8=  p1.get(4).getText();
		  Assert.assertEquals(text8,"Secure");
		  String text9=  p1.get(5).getText();
		  Assert.assertEquals(text9,"FX tools");
		  List<WebElement> p2 = driver.findElements(By.cssSelector(".joinNow p"));
		  String text10=  p2.get(0).getText();
		  Assert.assertEquals(text10,"Join now and see how much your business can save:");
		//	C5955	check the content for How it works tab under the business function 
		  List<WebElement> a1 = driver.findElements(By.cssSelector(".tabs li")) ;
		  a1.get(1).findElement(By.cssSelector("a")).click();
		  List<WebElement> c2 = driver.findElements(By.cssSelector(".tabPane h1"));
		  String txt2=  c2.get(1).getText();
		  Assert.assertEquals(txt2,"Simple but feature rich");
		  List<WebElement> p3 = driver.findElements(By.cssSelector(".featureIcons.inline.clearfix li")) ;
		  String txt5 =  p3.get(6).getText();
		  Assert.assertEquals(txt5,"Great rates"+"\n"+"Competitive exchange rates and low fees with the ability to track and make payments online 24/7.");
		  String txt6 =  p3.get(7).getText();
		  Assert.assertEquals(txt6,"Fast & easy"+"\n"+"Fast delivery of payments and receipts with notification alerts for you and your recipients.");
		  String txt7 =  p3.get(8).getText();
		  Assert.assertEquals(txt7,"Market professionals"+"\n"+"Experts who'll act as your eyes and ears in the markets and tailor services for your business.");
		  String txt8 =  p3.get(9).getText();
		  Assert.assertEquals(txt8,"FX tools"+"\n"+"Email rate alerts and detailed charting to track exchange rate movements.");
		  String txt9 =  p3.get(10).getText();
		  Assert.assertEquals(txt9,"Insights & information"+"\n"+"Live insights to help you make informed decisions for your trades and hedging strategies.");
		  String txt10 =  p3.get(11).getText();
		  Assert.assertEquals(txt10,"Flexible options"+"\n"+"A range of transaction options including forward contracts and market orders.");
		 // C5956	check the content for Features tab under the business function
		  a1.get(2).findElement(By.cssSelector("a")).click();
		  
		  List<WebElement> p4 = driver.findElements(By.cssSelector(".featureIcons.inline.fourItems.clearfix.liArrows li")) ;
		  String txt11 =  p4.get(0).getText();
		  Assert.assertEquals(txt11,"Sign up"+"\n"+"Sign up for a free no obligation account and access our latest tools and information.");
		  String txt12 =  p4.get(1).getText();
		  Assert.assertEquals(txt12,"Get a Quote"+"\n"+"Get a free quote and see how competitive our rates are before you commit.");
		  String txt13 =  p4.get(2).getText();
		  Assert.assertEquals(txt13,"Send"+"\n"+"Select your currencies and beneficiaries and pay by bank transfer.");
		  String txt14 =  p4.get(3).getText();
		  Assert.assertEquals(txt14,"Track"+"\n"+"You'll have visibility at each step and you will be alerted when funds are delivered.");
}
	  @AfterClass
	  public void close() {
	  driver.close();
	  }	
	}
