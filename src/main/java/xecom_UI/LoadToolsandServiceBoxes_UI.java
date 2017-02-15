package xecom_UI;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadToolsandServiceBoxes_UI {

	// heading for ad box
       @FindBy(css = ".service.index-xetrade.featuredProducts h2 a")
	   public WebElement heading_UI;
    
    // list of bullets
       @FindBy(css = ".serviceContent li")
	   public List<WebElement> servicecontent_UI;
       
    // list of bullets
       @FindBy(css = ".serviceContent p")
	   public List<WebElement> paragraph_UI;
    
    // List 
       @FindBy(css = ".serviceContent li")
	   public List<WebElement> options_UI;
    
    // XEMT link
       @FindBy(css = ".modFtr a")
	   public List<WebElement> transfer_UI;
       
    // XEMT link - output and chart page
       @FindBy(css = ".fServicesLnkBttm")
	   public List<WebElement> servicelink_UI;
    
    // heading for ad box in input page
       @FindBy(css = ".featuredServicesLnkTop.servicesLinkTitle a")
	   public List<WebElement> inputPage_UI;
    
    // download button
       @FindBy(css = ".modFtr a")
	   public List<WebElement> pageDownload_UI;
       
    // heading for ad box - outputpage 
       @FindBy(css = ".service.ucc_convert-xetrade.featuredProducts h2 a")
	   public WebElement output_UI;
       
    // heading for ad box - chart page
       @FindBy(css = ".service.freecharts-xetrade.featuredProducts h2 a")
	   public WebElement chartpage_UI;
}
