package xemt_UI;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalLastTabs_UI {

	public WebDriver driver;
    
	public PersonalLastTabs_UI (WebDriver driver) {
	        this.driver = driver;
}
	 @FindBy(css = ".tabPane h1")
	  public List<WebElement> heading_UI;
	 // Tabs Pane
     @FindBy(css = ".tabPane p")
	   public List<WebElement> tabPane_UI;
     //pull-left
     @FindBy(css = ".pull-left")
	   public List<WebElement> pullLeft_UI;
      // JoIn NOw
     @FindBy(css = ".joinNow p")
	   public List<WebElement> joinNow_UI;
     
     // featureIcons inline threeItems clearfix liArrows
     @FindBy(css = ".featureIcons.inline.threeItems.clearfix.liArrows")
	   public List<WebElement> featureIcons_uI;
     
     // featureIcons securit clearfix
     @FindBy(css = ".featureIcons.security.clearfix")
	   public WebElement featureiconsSecurity_UI;
     
     // Free personal account 
     @FindBy(css = ".button.large.personal.green.inline.roundedCorners")
	   public List<WebElement> freePersonalaccount_UI;
}