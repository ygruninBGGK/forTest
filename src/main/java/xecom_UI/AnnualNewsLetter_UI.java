package xecom_UI;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnualNewsLetter_UI {
	
	// NewsLetter heading
    @FindBy(css = ".module.clearfix.iNewsletter.layout h1")
	   public WebElement heading_UI;
    
    //Description
    @FindBy(css = ".pageDescriptionWrap")
	   public WebElement description_UI;

    // Heading
    @FindBy(css = ".relatedLinks.LnBxCUS h2")
	   public WebElement formHeading_UI;
    
    // button click
     @FindBy(css = ".button.green.roundedCorners")
	   public WebElement submit_UI;
    
    //error message for required feilds
    @FindBy(id = "newsletterSubRequiredField")
	   public WebElement Required_UI;
    
   //error message for required feilds
    @FindBy(css = ".subscriptionsForm-errorMessage")
	   public List<WebElement> errorMessage_UI;

}
