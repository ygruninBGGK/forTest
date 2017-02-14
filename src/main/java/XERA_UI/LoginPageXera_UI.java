package XERA_UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageXera_UI {
	
	// Login button
		@FindBy(id = "edit-submit")
		public WebElement button_UI;
		
	// Validating error messages 
		@FindBy(css = ".error li")
		public List<WebElement> error_UI;
		
	// Register a new XE account
		@FindBy(id = "edit-register")
		public WebElement register_UI;
		
	// Login button
		@FindBy(css = ".submit")
		public WebElement submit_UI;
		
	// sign up header 
		@FindBy(css = ".fieldWrapper")
		public WebElement signup_UI;
		
	// sign up header 
		@FindBy(id = "create")
		public WebElement create_UI;
		
	// error email
		@FindBy(css = ".error[for='email']")
		public WebElement required_UI;
		
	// error password
		@FindBy(css = ".error[for='password']")
		public WebElement password_UI;
		
	// error reenter password
		@FindBy(css = ".error[for='repassword']")
		public WebElement repassword_UI;
		
	// login button
		@FindBy(css = ".form-submit")
		public WebElement login_UI;
		
   // create alert button after login
		@FindBy(css = ".button.medium.customXERA.blue")
		public WebElement creatalert_UI;
	
   // create alert after selecting curency's
		@FindBy(css = ".alertMessage-statement")
		public WebElement alertmessage_UI;
		
   // create alert after selecting curency's
		@FindBy(css = ".button.customXERA.blue.full")
		public WebElement returntolist_UI;
		
	// enter email in email field 
		@FindBy(name = "name")
		public WebElement enteremail_UI;
	
	// enter password in password field 
		@FindBy(name = "pass")
		public WebElement enterpassword_UI;
		
	// from amount
		@FindBy(id = "fromAmount")
		public WebElement fromamount_UI;
		
	// to amount
		@FindBy(id = "toAmount")
		public WebElement toamount_UI;	
		
	// from currency
		@FindBy(id = "from")
		public WebElement fromcurrency_UI;
		
	// from currency
		@FindBy(id = "to")
		public WebElement tocurrency_UI;
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		//////////// action///////
		
		//driver.findElement(By.name("name")).sendKeys("sindhu.vallabhaneni42@gmail.com");

		
		 public void fillEmail(String email){
			 enteremail_UI.sendKeys(email);
		    }
		    
		 public void fillPassword(String pass){
			 enterpassword_UI.sendKeys(pass);
		    }
		
		 public void fillfromAmount(String fromnumber){
			 fromamount_UI.sendKeys(fromnumber);
		    }
		 
		 public void filltoAmount(String tonumber){
			 toamount_UI.sendKeys(tonumber);
		    }
		 
		 public void fillfromCurrency(String fromcurr){
			 fromcurrency_UI.sendKeys(fromcurr);
		    }
		 
		 public void filltoCurrency(String tocurr){
			 tocurrency_UI.sendKeys(tocurr);
		    }

}
