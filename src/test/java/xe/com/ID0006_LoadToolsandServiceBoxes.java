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
	private String usedBrowser;
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefox")String browser) throws MalformedURLException {	
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
		 Assert.assertEquals(text1,"Currency rates on-the-go ▶");
		 String text2 =   load.paragraph_UI.get(0).getText();
		 Assert.assertEquals(text2,"Download the FREE XE Currency App for smartphone or tablet to");
		 String text3 =   load.paragraph_UI.get(1).getText();
		 Assert.assertEquals(text3,"Available for iPhone, iPad, Android, Blackberry, Windows, Firefox OS devices.");
		 String text4 =   load.options_UI.get(0).getText();
		 Assert.assertEquals(text4,"Access live exchange rates");
		 String text5 =   load.options_UI.get(1).getText();
		 Assert.assertEquals(text5,"Calculate prices");
		 String text6 =   load.options_UI.get(2).getText();
		 Assert.assertEquals(text6,"View historical rate charts");
		 //input page
		 driver.get(baseUrl+"currencyconverter/");
		 String text9 =   load.inputPage_UI.get(1).getText();
		 Assert.assertEquals(text9,"Currency rates on-the-go ▶");
		 String text10 =   load.paragraph_UI.get(2).getText();
		 Assert.assertEquals(text10,"Download the FREE XE Currency App for smartphone or tablet to");
		 String text11 =   load.paragraph_UI.get(3).getText();
		 Assert.assertEquals(text11,"Available for iPhone, iPad, Android, Blackberry, Windows, Firefox OS devices.");
		 String text12 =   load.options_UI.get(0).getText();
		 Assert.assertEquals(text12,"Access live exchange rates");
		 String text13 =   load.options_UI.get(1).getText();
		 Assert.assertEquals(text13,"Calculate prices");
		 String text14 =   load.options_UI.get(2).getText();
		 Assert.assertEquals(text14,"View historical rate charts");
		 String text15 =   load.pageDownload_UI.get(2).getText();
		 Assert.assertEquals(text15,"Download now ▶");
		 //output Page
		 driver.findElement(By.id("ucc_go_btn_svg")).click();
		 Externalad();
		 String txt7 =   load.pageDownload_UI.get(1).getText();
		 Assert.assertEquals(txt7,"Download now ▶");
		 //currency chart
		 driver.get(baseUrl+"currencycharts");
		 Externalad();
		 String txt8 =   load.pageDownload_UI.get(0).getText();
		 Assert.assertEquals(txt8,"Download now ▶");	 
	 }
		 
	     private void Externalad(){
			 String text8 =   load.inputPage_UI.get(0).getText();
			 Assert.assertEquals(text8,"Currency rates on-the-go ▶");
			 String txt2 =   load.paragraph_UI.get(0).getText();
			 Assert.assertEquals(txt2,"Download the FREE XE Currency App for smartphone or tablet to");
			 String txt3 =   load.paragraph_UI.get(1).getText();
			 Assert.assertEquals(txt3,"Available for iPhone, iPad, Android, Blackberry, Windows, Firefox OS devices.");
			 String txt4 =   load.options_UI.get(0).getText();
			 Assert.assertEquals(txt4,"Access live exchange rates");
			 String txt5 =   load.options_UI.get(1).getText();
			 Assert.assertEquals(txt5,"Calculate prices");
			 String txt6 =   load.options_UI.get(2).getText();
			 Assert.assertEquals(txt6,"View historical rate charts");
		 }
		 
	 
	 @AfterClass
 	  public void close() {
 	  driver.close();
 	  }	
}

	 
	 
