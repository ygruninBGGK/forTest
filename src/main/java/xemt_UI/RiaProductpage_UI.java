package xemt_UI;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RiaProductpage_UI {
	// Ria Content Heading
	    @FindBy(css = ".riaMainContent h1")
	    public WebElement mainContent_UI;
	
	// Ria paragraph
		@FindBy(css = ".riaMainContent p")
		public WebElement riaParagraph_UI;
		
	// faq list
		@FindBy(css = ".riaFeaturesUL li")
		public List<WebElement> featureList_UI;
		
    // Who is Ria content
	    @FindBy(css = ".whoIsRiaContent h2")
	    public WebElement whoIsRia_UI;
	    
	//  Who is Ria - paragraph
	    @FindBy(css = ".whoIsRiaContent p")
	    public WebElement whoIsRiaparagraph_UI;
	  
    // faq list
		@FindBy(css = ".featureIcons.inline.fourItems.clearfix li")
		public List<WebElement> featureIcons_UI;
		
	//  foot note
	    @FindBy(css = ".footnote p")
	    public WebElement footNote_UI;
	    
	//  riaLogoContainer 
	    @FindBy(css = ".riaLogoContainer p")
	    public List<WebElement> logoContainer_UI;
	    
	// button click
	    @FindBy(css = ".button.large.green.roundedCorners")
	    public WebElement greenButton_UI;
	
	// Ria content for CA
	    @FindBy(css = ".container-fluid h1")
	    public WebElement container_UI;
	    
	// verifying Ria content
	    @FindBy(css = ".container-fluid p")
	    public List<WebElement> containerParagraph_UI;
	    
	    
}
