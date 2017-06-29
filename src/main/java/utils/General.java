package utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class General {

    // Webdriver initiating
    protected WebDriver driver;
    public General(WebDriver driver) {
        this.driver = driver;
    }


    // open URL method
    public void open(String url) {
      driver.get(url);
  	  driver.manage().window().setSize(new Dimension(1920, 1080));
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    }
    
 // registration logout
    public void logoutRegistration(String url) {
    	//waitElementIsPresented(driver.findElement(By.cssSelector(".state.state5.done")));
        driver.get("https://auth-dev.xe.com/user/logout?continue=https%3A%2F%2Fxecd-dev.xe.com%2F&product=XECD");
    }

    // Close the browser
    public void close() {
        driver.quit(); 
    }

    // Wait implicitly
    public void wait10sec() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicitly wait - wait to appear next step - Wait for appearing in DOM
    }

    // Wait implicitly
    public void wait20sec() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicitly wait - wait to appear next step - Wait for appearing in DOM
    }
    
    public void waitElementIsPresented(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    
 public void openStartingPage(String url,String usedbrowser) throws InterruptedException{
    	driver.get(url);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        // if run on ie 
	        if (usedbrowser.equals("IE")){
	        	wait10sec();
	        	driver.navigate().to("javascript:document.getElementById('overridelink').click()"); //Java script to click the link
	        	wait10sec();
	        }    
    }
}
