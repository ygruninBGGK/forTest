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
//	C11176	Replace the XE Trade Ad on the community page

public class ID0006_LoadToolsandServiceBoxes {

	private String baseUrl;
	private WebDriver driver;
	private  LoadToolsandServiceBoxes_UI load;
	private General general;
	
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefoxLocal")String browser) throws MalformedURLException {	
		//usedBrowser = browser;
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		load =  PageFactory.initElements(driver,  LoadToolsandServiceBoxes_UI.class);
		baseUrl = url;
}
	 @Test
     public void loadTools() throws InterruptedException {
		 //general.openStartingPage(baseUrl, usedBrowser);
		 driver.get(baseUrl);
		 String text1 =   load.heading_UI.getText();
		 Assert.assertEquals(text1,"XE Money Transfer ▶");
		 String text2 =   load.paragraph_UI.get(0).getText();
		 Assert.assertEquals(text2,"Transfer money online with XE.");
		 String text4 =   load.options_UI.get(0).getText();
		 Assert.assertEquals(text4,"Free online quotes");
		 String text5 =   load.options_UI.get(1).getText();
		 Assert.assertEquals(text5,"Competitive rates");
		 String text6 =   load.options_UI.get(2).getText();
		 Assert.assertEquals(text6,"No fees");
		 String text7 =   load.options_UI.get(3).getText();
		 Assert.assertEquals(text7,"Works with your bank account");
		 //input page
		 driver.get(baseUrl+"currencyconverter/");
		 String text9 =   load.inputPage_UI.get(0).getText();
		 Assert.assertEquals(text9,"No Fee Transfers ▶");
		 String text10 =   load.paragraph_UI.get(0).getText();
		 Assert.assertEquals(text10,"For personal or business use, send an international money transfer with XE.");
		 String text12 =   load.options_UI.get(0).getText();
		 Assert.assertEquals(text12,"Competitive rates");
		 String text13 =   load.options_UI.get(1).getText();
		 Assert.assertEquals(text13,"Free online quotes");
		 String text15 =   load.pageDownload_UI.get(1).getText();
		 Assert.assertEquals(text15,"Get a Quote Now ▶");
		 //output Page
		 driver.findElement(By.id("ucc_go_btn_svg")).click();
		 Externalad();
		 String txt7 =   load.pageDownload_UI.get(1).getText();
		 Assert.assertEquals(txt7,"Transfer Money Now ▶");
		 //currency chart
		 driver.get(baseUrl+"currencycharts");
		 Externalad();
		 String txt8 =   load.pageDownload_UI.get(0).getText();
		 Assert.assertEquals(txt8,"Transfer Money Now ▶");	 
	 }
		 
	     private void Externalad(){
			 String text8 =   load.inputPage_UI.get(0).getText();
			 Assert.assertEquals(text8,"Send Money with XE ▶");
			 String txt3 =   load.paragraph_UI.get(0).getText();
			 Assert.assertEquals(txt3,"Transfer money online with XE.");
			 String txt4 =   load.options_UI.get(0).getText();
			 Assert.assertEquals(txt4,"No fees");
			 String txt5 =   load.options_UI.get(1).getText();
			 Assert.assertEquals(txt5,"Free online quotes");
			 String txt6 =   load.options_UI.get(2).getText();
			 Assert.assertEquals(txt6,"Competitive rates");
		 }
		 
	 
	 @AfterClass
 	  public void close() {
 	  driver.close();
 	  }	
}

	 
	 
