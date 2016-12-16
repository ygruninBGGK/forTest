package xecom_UI;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class removeBetatest_UI {

	// module clearfix errors h1
		@FindBy(css = ".module.clearfix.errors h1")
		public WebElement moduleClearfix_UI;
		
    // Subtitle
		@FindBy(css = ".subTitle2")
		public WebElement subTitle_UI;
		
    // page description
	    @FindBy(css = ".pageDescription")
	    public WebElement pageDescription_UI;
	
    // faq list
		@FindBy(css = ".faqList li")
		public List<WebElement> faqList_UI;
		
	// faq list
		@FindBy(css = ".faqList li a")
	    public List<WebElement> faqLink_UI;
		
	// .module.clearfix p
		@FindBy(css = ".module.clearfix p")
		public List<WebElement> moduleParagraph_UI;
		
	// .module.clearfix p
		@FindBy(css = ".moduleActionClass li")
		public List<WebElement> moduleAction_UI;
}
