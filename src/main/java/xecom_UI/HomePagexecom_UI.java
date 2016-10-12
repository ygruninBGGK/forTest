package xecom_UI;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class HomePagexecom_UI {
		
		// WebDriver initiating
	    public WebDriver driver;
	    
	    public HomePagexecom_UI(WebDriver driver) {
	        this.driver = driver;
	    } 
	        
	        @FindBy(css = ".faqList li")
		    public List<WebElement> FaqList;

	}
