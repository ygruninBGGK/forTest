package utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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


    // Find excel path
    //Define the Excel path
    static String path = getAppPath();
    public static String getAppPath() {
        String path = "";
        try {
            path = new File(".").getCanonicalPath();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return path;
    }

    public static String ExcelFilePath = path + "/input-data/DataSource1.xls";
    public static String Path = path;




    // Wait for argument changing inside some element
    public void waitArgumentChange(final WebElement element, final String argument, final String argChanged) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                String b = element.getAttribute(argument);
                System.out.print(b);
                if (b.equals(argChanged))
                    return true;
                else
                    return false;
            }

        });

    }
    
    
    
    public void waitTextChanged( WebElement element, String value) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
    }
    
    
    
    


    public void waitElementIsClickable(final WebElement element) {
        //System.out.println("The element send by delete to test if clickable === "  + element);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public void waitElementIsPresented(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    public void openStartingPage(String url,String usedbrowser){

    	driver.get(url);
        driver.manage().window().maximize();

        // if run on ie 
	        if (usedbrowser.equals("IE")){
	        	wait10sec();
	        	driver.navigate().to("javascript:document.getElementById('overridelink').click()"); //Java script to click the link
	        	wait10sec();
	        }
	      
	       
    }
   


}
