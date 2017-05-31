package utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_UI {

	
		/// sign up
		
	    @FindBy(id = "user_first_name")
		   public WebElement name_UI;
	    
	    
	    @FindBy(id = "user_email")
		   public WebElement email_UI;


	    @FindBy(id = "user_password_signup")
		   public WebElement pwd_UI;
	    
	  
	     @FindBy(css = ".button")
		   public WebElement btn_UI;
	     
	
	     @FindBy(css = "#emailForm p")
		   public WebElement error_UI;
	    
	
	     
	     
	     
	     
	     
	     /// login
	     @FindBy(id = "userSignInFormEmail")
		   public WebElement emailLogin_UI;
	     
	     
	     @FindBy(id = "user_password")
		   public WebElement pwdLogin_UI;
	     
	     
	     @FindBy(css = ".gr-button.gr-button--dark")
		   public WebElement loginBtn_UI;
	     
	     
	     
	     
	
	     
	     
	     
	     
	     
	     
	     
}
