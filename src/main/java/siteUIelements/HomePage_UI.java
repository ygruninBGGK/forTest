package siteUIelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage_UI {
	
	// WebDriver initiating
    public WebDriver driver;
    
    public HomePage_UI(WebDriver driver) {
        this.driver = driver;
    }
	
	
	///////////////// elements/////////////////
	
   //sign up button
    @FindBy(css =".signUpButtonWrap a")
    public WebElement signUpBtn_UI;
	
   // Form
    @FindBy(css ="form")
    public WebElement Form;
    
   // First name
    @FindBy(id ="Firstname")
    public WebElement firstname;
    
   // Lastname
    @FindBy(id ="Lastname")
    public WebElement lastname;
    
    //dropdown
    @FindBy(id ="Countrycode")
    public WebElement CountryCode;
    
    //passwod
	@FindBy(id ="Password")
	public WebElement PWD;
	
	// Re-enter password
	@FindBy (id ="PasswordConfirm")
	public WebElement ReEnterpwd;
	
	
	/////////////////actions////////////////////
	
    //click on sign up btn
	public void clickSignUpBtn (){
		signUpBtn_UI.click();
	}
	// Click on Next button
	public void clickForm(){
		Form.click();
	}
	// enter first name 
	public void enterFirstname(String name){
		firstname.sendKeys(name);
	}
	// enter last name
	public void enterLastname(String name){
		lastname.sendKeys(name);
	}
   // drop down - country code
	public void countryCode(String name){
		Select dropdown = new Select(CountryCode);
		dropdown.selectByVisibleText(name);
		
	}
	 
	public Boolean getcountrycode(String textToCheck) {
	    return CountryCode.getText().equals(textToCheck);
}
	//password
	public void enterPassword(String name){
		PWD.sendKeys(name);
	}
	//password confirmation
	public void enterPasswordConfirm(String name){
		ReEnterpwd.sendKeys(name);
	}
}
