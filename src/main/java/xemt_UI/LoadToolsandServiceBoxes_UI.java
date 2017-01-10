package xemt_UI;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadToolsandServiceBoxes_UI {

	// heading for ad box
    @FindBy(css = ".service.index-apps.featuredProducts h2 a")
	   public WebElement heading_UI;
    
    //paragraph
    @FindBy(css = ".serviceContent p")
	   public List<WebElement> paragraph_UI;
    
    //List 
    @FindBy(css = ".serviceContent li")
	   public List<WebElement> options_UI;
    
    // download button
    @FindBy(css = ".modFtr a")
	   public WebElement download_UI;
    
    // heading for ad box in input page
    @FindBy(css = ".featuredServicesLnkTop.servicesLinkTitle a")
	   public List<WebElement> inputPage_UI;
    
    //  download button
    @FindBy(css = ".modFtr a")
	   public List<WebElement> pageDownload_UI;
}
