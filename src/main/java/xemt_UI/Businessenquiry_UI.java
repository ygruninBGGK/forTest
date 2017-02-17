package xemt_UI;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Businessenquiry_UI {

	// button large green roundedCorners
	@FindBy(css = ".button.large.green.roundedCorners li")
	public List<WebElement> buttonLarge_UI;

	// Business enquiry form Heading
	@FindBy(css = ".module.clearfix.fixedNavOffset h1")
	public WebElement moduleHeading_UI;

	// Business enquiry form paragraph
	@FindBy(css = ".module.clearfix.fixedNavOffset p")
	public WebElement moduleParagraph_UI;

	// error message for first name
	@FindBy(css = ".error[for='firstName']")
	public WebElement errorFirstname_UI;

	// error message for last name
	@FindBy(css = ".error[for='lastName']")
	public WebElement errorLastname_UI;

	// error message for business name
	@FindBy(css = ".error[for='businessName']")
	public WebElement errorBusinessname_UI;

	// error message for address
	@FindBy(css = ".error[for='address']")
	public WebElement address_UI;

	// error message for address
	@FindBy(css = ".error[for='phone']")
	public WebElement phone_UI;

	// error message for address
	@FindBy(css = ".error[for='email']")
	public WebElement email_UI;

	// error message for currencies brought
	@FindBy(css = ".error[for='currenciesBought']")
	public WebElement currenciesBought_UI;

	// error message for currencies brought
	@FindBy(css = ".error[for='currenciesSold']")
	public WebElement currenciesSold_UI;

	// error message for turnover
	@FindBy(css = ".error[for='turnover']")
	public WebElement turnover_UI;

	// reasons
	@FindBy(css = ".error[for='reasons']")
	public WebElement reasons_UI;

	// header
	@FindBy(css = ".enquiryFormHeader")
	public WebElement thankyou_UI;

	// enquiry form Desc
	@FindBy(css = ".enquiryFormDesc")
	public WebElement message_UI;

	// footer
	@FindBy(css = ".enquiryFormFooter")
	public WebElement footer_UI;
	
	// sign up overlay
	@FindBy(css = "#businessSignupOverlay h2")
	public WebElement signupOverlay_UI;
	
	// account type choice
	@FindBy(css = ".accountTypeChoice")
	public WebElement accountChoice_UI;
	
}
