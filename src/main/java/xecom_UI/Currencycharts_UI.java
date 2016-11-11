package xecom_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Currencycharts_UI {
	public WebDriver driver;
    
	public Currencycharts_UI(WebDriver driver) {
	        this.driver = driver;
	}
	

	  //Personal
	    @FindBy(id ="from")
      public WebElement fromField;
	    
	    //Personal
	    @FindBy(id ="to")
      public WebElement toField;
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     public void fillFrom (String fromCurrency) throws InterruptedException{
	    	fromField.sendKeys(fromCurrency);
	    	//Thread.sleep(3000);
	    	driver.findElement(By.cssSelector("#from_scroller li")).click();
	    	
	    }
	    
	    public void fillTo (String toCurrency){
	    	toField.sendKeys(toCurrency);
	    	driver.findElement(By.cssSelector("#to_scroller li")).click();
	    }
	
}
