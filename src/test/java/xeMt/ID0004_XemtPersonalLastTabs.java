package xeMt;

import org.testng.annotations.Test;

import utils.Browsers;
import utils.General;

import org.testng.Assert;


import xemt_UI.PersonalLastTabs_UI;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'naga' at '9/12/16 3:42 PM' with Gradle 2.14.1
 *
 * @author naga, @date 9/12/16 3:42 PM
 */


//	C7608	XE Money Transfer - Last 3 tabs
// C5240 Verify Xe Money transfer web page is navigating properly or not 
//C5254	Verify Xe Money transfer webpage navigating properly



public class ID0004_XemtPersonalLastTabs {
	
	private String baseUrl;
	private WebDriver driver;
	private PersonalLastTabs_UI home; 
	private General general;
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		home =  PageFactory.initElements(driver, PersonalLastTabs_UI.class);
		baseUrl = "http://gamma.xe.com/";
	}
	
	
	
         @Test
         public void a_redirectToXeMt() throws InterruptedException {
    		
        	 //	C7608	XE Money Transfer - Last 3 tabs
   		  driver.get(baseUrl);
   		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   		  driver.get(baseUrl+"/xemoneytransfer/");
		  //Great rates and no fees
		  // Check the content for Nz
		  driver.get(baseUrl+"/xemoneytransfer/"+"/nz/"+"#greatratesnofees");
		  Thread.sleep(2000);
 		  String text5 =  home.tabPane_UI.get(7).getText();
 		  Assert.assertEquals(text5,"We believe in offering fair and transparent pricing. When you transfer money with XE our rates are clearly displayed so you'll know exactly what you pay before you complete your transaction. We save you money in 2 ways:");
 		  Thread.sleep(2000);
 		  contentCheck();
		  // Check the content for au
		   driver.get(baseUrl+"/xemoneytransfer/"+"/au/"+"#greatratesnofees");
		   Thread.sleep(2000);

		   String text7 =  home.tabPane_UI.get(7).getText();
		   Assert.assertEquals(text7,"We believe in offering fair and transparent pricing. When you transfer money with XE our rates are clearly displayed so you'll know exactly what you pay before you complete your transaction. We save you money in 2 ways:");
		   contentCheck();
		   // Check the content for Ca
		   driver.get(baseUrl+"/xemoneytransfer/"+"/ca/"+"#greatratesnofees");


		   Thread.sleep(3000);
		   String text8 =  home.tabPane_UI.get(8).getText();
		   Assert.assertEquals(text8,"We believe in offering fair and transparent pricing. When you transfer money with XE our rates are clearly displayed so you'll know exactly what you pay before you complete your transaction.");
		   contentCheck();
		    //Check the content for us
		   driver.get(baseUrl+"/xemoneytransfer/"+"/us/"+"#greatratesnofees");
		   Thread.sleep(2000);

		   String text9 =  home.tabPane_UI.get(11).getText();
		   Assert.assertEquals(text9,"We believe in offering fair and transparent pricing. When you transfer money with XE our rates are clearly displayed so you'll know exactly what you pay before you complete your transaction.");

		   contentCheck();
		   //Check the content for uk
		   driver.get(baseUrl+"/xemoneytransfer/"+"/uk/"+"#greatratesnofees");
		   Thread.sleep(2000);
  		   String text4 =  home.heading_UI.get(3).getText();
  		   Assert.assertEquals(text4,"Keep more of your money when you transfer with XE");
  		   String txt5 =  home.tabPane_UI.get(9).getText();
  		   Assert.assertEquals(txt5,"Every month we use an independent company to check all the main high street banks and building societies to make sure our overall price (including bank charges, exchange rates and other fees) is better. We save you money in 2 ways:");

		   String text3 = home.pullLeft_UI.get(4).getText();
		   Assert.assertEquals(text3,"Our fees are simple: £0"+"\n"+"All transfers with XE Money Transfer are fee free. Sign up to access fee free transfers and great exchange rates. Existing customers log in to make a transfer now.");
           //Trusted brand
		   // Check the content for Nz
		   driver.get(baseUrl+"/xemoneytransfer/"+"/nz"+"#trustedbrand");
		   Thread.sleep(2000);
  		   String text1 =  home.tabPane_UI.get(12).getText();
  		   Assert.assertEquals(text1,"Over the past 20 years, we've earned the trust of millions of people worldwide through our transparent exchange rates and free currency tools. With XE Money Transfers, we continue to build this trust by offering a service that exemplifies respect for customers.");
		   TrustandRespect();
		   // Check the content for au
		   driver.get(baseUrl+"/xemoneytransfer/"+"/au/"+"#trustedbrand");
		   Thread.sleep(2000);
  		   String txt1 = home.tabPane_UI.get(12).getText();
  		   Assert.assertEquals(txt1,"Over the past 20 years, we've earned the trust of millions of people worldwide through our transparent exchange rates and free currency tools. With XE Money Transfers, we continue to build this trust by offering a service that exemplifies respect for customers.");
		   TrustandRespect();
		   // Check the content for Ca
		   driver.get(baseUrl+"/xemoneytransfer/"+"/ca/"+"#trustedbrand");
		   Thread.sleep(2000);
  		   String txt2 =  home.tabPane_UI.get(11).getText();
  		   Assert.assertEquals(txt2,"Over the past 20 years, we've earned the trust of millions of people worldwide through our transparent exchange rates and free currency tools. With XE Money Transfers, we continue to build this trust by offering a service that exemplifies respect for customers.");
		   TrustandRespect();
		   //Check the content for us
		   driver.get(baseUrl+"/xemoneytransfer/"+"/us/"+"#trustedbrand");
		   Thread.sleep(2000);
  		   String txt3 =  home.tabPane_UI.get(14).getText();
  		   Assert.assertEquals(txt3,"Over the past 20 years, we've earned the trust of millions of people worldwide through our transparent exchange rates and free currency tools. With XE Money Transfers, we continue to build this trust by offering a service that exemplifies respect for customers.");
		   TrustandRespect();
		   //Check the content for uk
		   driver.get(baseUrl+"/xemoneytransfer/"+"/uk/"+"#trustedbrand");
		   Thread.sleep(2000);
  		   String txt4 =  home.tabPane_UI.get(14).getText();
  		   Assert.assertEquals(txt4,"Over the past 20 years, we've earned the trust of millions of people worldwide through our transparent exchange rates and free currency tools. With XE Money Transfers, we continue to build this trust by offering a service that exemplifies respect for customers.");
		   TrustandRespect();
           // secure and reliable
		   // Check the content for Nz
		   driver.get(baseUrl+"/xemoneytransfer/"+"/nz/"+"#securereliable");
		   Thread.sleep(2000);
  		   String text6 =  home.tabPane_UI.get(14).getText();
  		   Assert.assertEquals(text6,"Trust us for your next money transfer. Join now:");
		   SecureandReliable();
		   // Check the content for au
		   driver.get(baseUrl+"/xemoneytransfer/"+"/au/"+"#securereliable");
		   Thread.sleep(2000);
  		   String txt7 =  home.tabPane_UI.get(14).getText();
  		   Assert.assertEquals(txt7,"Trust us for your next money transfer. Join now:");
		   SecureandReliable();
		   // Check the content for Ca
		   driver.get(baseUrl+"/xemoneytransfer/"+"/ca/"+"#securereliable");
		   Thread.sleep(2000);
  		   String txt8 =  home.tabPane_UI.get(13).getText();
  		   Assert.assertEquals(txt8,"Trust us for your next money transfer. Join now:");
		   SecureandReliable();
		   //Check the content for us
		   driver.get(baseUrl+"/xemoneytransfer/"+"/us/"+"#securereliable");
		   Thread.sleep(2000);
  		   String txt9 =  home.tabPane_UI.get(16).getText();
  		   Assert.assertEquals(txt9,"Trust us for your next money transfer. Join now:");
		   SecureandReliable();
		   //Check the content for uk
		   driver.get(baseUrl+"/xemoneytransfer/"+"/uk/"+"#securereliable");
		   Thread.sleep(2000);
  		   String txt10 =  home.tabPane_UI.get(16).getText();
  		   Assert.assertEquals(txt10,"Trust us for your next money transfer. Join now:");
		   SecureandReliable();   
         }

         
        private void contentCheck() throws InterruptedException{
           Thread.sleep(2000); 
  		   String text4 =  home.heading_UI.get(3).getText();
  		   Assert.assertEquals(text4,"Keep more of your money when you transfer with XE");
  		   Thread.sleep(2000);
		   String text3 =  home.pullLeft_UI.get(4).getText();
		   Assert.assertEquals(text3,"Our fees are simple: $0"+"\n"+"All transfers with XE Money Transfer are fee free. Sign up to access fee free transfers and great exchange rates. Existing customers log in to make a transfer now.");
		   Thread.sleep(2000);
  		   String text6 =  home.joinNow_UI.get(2).getText();
  		   Assert.assertEquals(text6,"See how much you could save. Join now:");
         }
         
         private void TrustandRespect() throws InterruptedException{
        	 Thread.sleep(2000);
    		 String text2 =  home.featureIcons_uI.get(0).getText();
    		 Assert.assertEquals(text2,"We serve 33,000 customers annually ..."+"\n"+"... who send money across 127 countries ..."+"\n"+"... and have transferred $10+ Billion to date");
    		 Thread.sleep(2000);
    		 String text5 =  home.joinNow_UI.get(3).getText();
    		 Assert.assertEquals(text5,"Trust us for your next money transfer. Join now:");
         }
         
         private void SecureandReliable() throws InterruptedException{
        	 
        	 Thread.sleep(2000);
    		 String text1 = home.heading_UI.get(5).getText();
    		 Assert.assertEquals(text1,"Your security is our priority.");
    		 Thread.sleep(2000);
    		 String text2 =  home.featureiconsSecurity_UI.getText();
    		 Assert.assertEquals(text2,"Secure"+"\n"+"We take the greatest care in ensuring the security of XE Money Transfer. That's why we use Norton security – 97 of the world's 100 largest banks and over 93% of Fortune 500 companies use Norton. In addition, Norton secures more than one million Web servers worldwide."+"\n"+"Reliable"+"\n"+"With XE Money Transfer, you get payment tracking every step of the way. We'll keep you up to date with your transaction via SMS and email. If you choose, we can inform your recipients when your funds are on their way."+"\n"+"Regulated"+"\n"+"We take our legal responsibilities very seriously. Where required, our provider has regulatory approval in every country that we operate in including FinCen in the USA, the Financial Conduct Authority in the UK, ASIC in Australia and the FMA in New Zealand."+"\n"+"Peace of Mind"+"\n"+"In 2015, XE became part of Euronet Worldwide, Inc. (NASDAQ: EEFT), recognized leaders in providing global financial services. Last year, our group transacted over $11 billion for 112,000 clients in 117 countries.");          
    		 
         }
         @AfterClass
   	  public void close() {
   	  driver.close();
   	  }	
         }
