package xemt_UI;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessFirsttabs_UI {
	// Pull-Left
    @FindBy(css = ".pull-left h1")
	   public WebElement pullLeft_UI;
    
    // Pull -left P
    @FindBy(css = ".pull-left p")
	   public List<WebElement> pullLeftp_UI;
    
	//FeatureIcons inline sixItems clearfix 
    @FindBy(css = ".featureIcons.inline.sixItems.clearfix li")
	   public List<WebElement> featureIconsSixItems_UI;
    // JoIn NOw
    @FindBy(css = ".joinNow p")
	   public List<WebElement> joinNow_UI;
    
    // tabs list
    @FindBy(css = ".tabs li")
	   public List<WebElement> tabsli_UI;
    // Tabs Pane
    @FindBy(css = ".tabPane p")
	   public List<WebElement> tabPane_UI;
    // featureIcons inline clearfix li
    @FindBy(css = ".featureIcons.inline.clearfix li")
	   public List<WebElement> featureIconsInlineclearfix_UI;
    
    //.featureIcons.inline.fourItems.clearfix.liArrows li
    @FindBy(css = ".featureIcons.inline.fourItems.clearfix.liArrows li")
	   public List<WebElement> featureIconFourItems_UI;
    // Tabs Pane
    @FindBy(css = ".tabPane h1")
	   public List<WebElement> heading_UI;
}
