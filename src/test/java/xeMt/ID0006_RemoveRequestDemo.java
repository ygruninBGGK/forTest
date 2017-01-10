package xeMt;

import org.testng.annotations.Test;

import utils.Browsers;
import utils.General;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import xemt_UI.BusinessLasttabs_UI;
import xemt_UI.RemoveRequestDemo_UI;
import xemt_UI.WhyXePage;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ID0006_RemoveRequestDemo {
	private String baseUrl;
	private WebDriver driver;
	private RemoveRequestDemo_UI demo;
	private General general;
	
	
	@Parameters({"BaseUrl","browser"})
    @BeforeClass
    public void BaseUrl(@Optional("http://gamma.xe.com/") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
		driver = Browsers.getDriver(browser);
		general = PageFactory.initElements(driver, General.class);
		demo =  PageFactory.initElements(driver, RemoveRequestDemo_UI.class);
		baseUrl = url;
		
	}

	@Test
    public void a_redirectToXeMt() throws InterruptedException {
	 
	}
	
	
	
	
	 @AfterClass
  	  public void close() {
  	  driver.close();
  	  }	
}

