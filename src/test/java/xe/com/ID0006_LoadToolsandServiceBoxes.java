package xe.com;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.General;
import xecom_UI.LoadToolsandServiceBoxes_UI;

//C9256	Load tools and services boxes by Ajax 

public class ID0006_LoadToolsandServiceBoxes {

	private String baseUrl;
	private WebDriver driver;
	private  LoadToolsandServiceBoxes_UI load;
	private General general;
	private String usedBrowser;
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefoxLocal")String browser) throws MalformedURLException {	
		usedBrowser = browser;
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		load =  PageFactory.initElements(driver,  LoadToolsandServiceBoxes_UI.class);
		baseUrl = url;
}
	 @Test
     public void loadTools() throws InterruptedException {
		 general.openStartingPage(baseUrl, usedBrowser);
		 String text1 =   load.heading_UI.getText();
		 Assert.assertEquals(text1,"Send a cheap money transfer ▶");
		 String text10 =   load.paragraph_UI.get(0).getText();
		 Assert.assertEquals(text10,"Looking to send money abroad? Transferring money online is easy with XE. Our service works with your bank and it's free to sign up.");
		 String text2 =   load.servicecontent_UI.get(0).getText();
		 Assert.assertEquals(text2,"Free online quotes");
		 String text3 =   load.servicecontent_UI.get(1).getText();
		 Assert.assertEquals(text3,"Competitive exchange rates");
		 String text4 =   load.servicecontent_UI.get(2).getText();
		 Assert.assertEquals(text4,"No-fee money transfer options");
		 String text5 =   load.servicecontent_UI.get(3).getText();
		 Assert.assertEquals(text5,"Bid for your preferred rate");
		 String text6 =   load.transfer_UI.get(0).getText();
		 Assert.assertEquals(text6,"Transfer Money with XE ▶");
		 //input page
		 driver.get(baseUrl+"currencyconverter/");
		 String text9 =   load.inputPage_UI.get(0).getText();
		 Assert.assertEquals(text9,"Send a cheap money transfer ▶");
		 String text13 =   load.paragraph_UI.get(0).getText();
		 Assert.assertEquals(text13,"Whether you are looking for personal or business use, it's easy to send an international money transfer with XE.");
		 String text11 =   load.paragraph_UI.get(1).getText();
		 Assert.assertEquals(text11,"We offer free online quotes, competitive exchange rates, no-fee payment options, and more. Signing up for an online account is free and our service works with your bank account.");
		 String text12 =   load.transfer_UI.get(1).getText();
		 Assert.assertEquals(text12,"Transfer Money with XE ▶");
		 //output Page
		 driver.findElement(By.id("ucc_go_btn_svg")).click();
		 String text14 =   load.output_UI.getText();
		 Assert.assertEquals(text14,"Send a cheap money transfer ▶");
		 Externalad();
		 //currency chart
		 driver.get(baseUrl+"currencycharts");
		 String text15 =   load.chartpage_UI.getText();
		 Assert.assertEquals(text15,"Send a cheap money transfer ▶");
		 Externalad();
		  
	 }
		 
	     private void Externalad(){
	    	 
			 String text5 =   load.paragraph_UI.get(0).getText();
			 Assert.assertEquals(text5,"Looking to send money abroad? Transferring money online is easy with XE. Our service works with your bank and it's free to sign up.");
	    	 String text2 =   load.servicecontent_UI.get(0).getText();
			 Assert.assertEquals(text2,"Free online quotes");
			 String text3 =   load.servicecontent_UI.get(1).getText();
			 Assert.assertEquals(text3,"Competitive exchange rates");
			 String text4 =   load.servicecontent_UI.get(2).getText();
			 Assert.assertEquals(text4,"No-fee money transfer options");
			 String text7 =   load.servicecontent_UI.get(3).getText();
			 Assert.assertEquals(text7,"Bid for your preferred rate");
			 String text6 =   load.servicelink_UI.get(0).getText();
			 Assert.assertEquals(text6,"Transfer Money with XE ▶");
		 }
		 
	 
	 @AfterClass
 	  public void close() {
 	  driver.close();
 	  }	
}

	 
	 
