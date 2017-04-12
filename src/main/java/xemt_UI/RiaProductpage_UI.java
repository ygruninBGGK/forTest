package xemt_UI;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RiaProductpage_UI {
	// Ria Content Heading
	    @FindBy(css = ".riaWrapper.meetRiaContent.clearfix h1")
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
	    @FindBy(css = ".riaWrapper.meetRiaContent.clearfix p")
	    public WebElement whoIsRiaparagraph_UI;
	  
    // faq list
		@FindBy(css = ".riaWrapper.featureIcons.inline.threeItems.clearfix li")
		public List<WebElement> featureIcons_UI;
		
	//  foot note
	    @FindBy(css = ".footnote p")
	    public WebElement footNote_UI;
	    
	//  amazon offer paragraph
	    @FindBy(css = ".amazonOfferText p")
	    public WebElement amazonoffertext_UI;
	    
	//  amazon offer learn more
	    @FindBy(css = ".amazonOfferText a")
	    public WebElement amazonofferlink_UI;
	    
	// button click
	    @FindBy(css = ".riaWrapper.meetRiaContent.clearfix a")
	    public WebElement sendmoneybutton_UI;
	
	// Ria content for CA
	    @FindBy(css = ".container-fluid h1")
	    public WebElement container_UI;
	    
	// verifying Ria content
	    @FindBy(css = ".container-fluid p")
	    public List<WebElement> containerParagraph_UI;
	    
	 // Content 
	    @FindBy(css = ".trustedExpertContent h2")
	    public WebElement trustedcontent_UI;
	    
	 // Content paragraph
	    @FindBy(css = ".trustedExpertContent p")
	    public WebElement trustedcontentparagraph_UI;
	    
}
