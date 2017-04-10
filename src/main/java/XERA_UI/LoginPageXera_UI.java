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

	// Validating error messages 
		@FindBy(css = ".messages.error")
		public List<WebElement> errormessge_UI;
		
		
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
		@FindBy(css = ".error[for='password_confirm']")
		public WebElement repassword_UI;
		
	// login button
		@FindBy(css = ".form-submit")
		public WebElement login_UI;
		
   // create alert button after login
		@FindBy(css = ".nav-right a")
		public WebElement creatalert_UI;
	
   // create alert after selecting curency's
		@FindBy(css = ".button.green.customXERA")
		public WebElement createalert_UI;
		
   // Return to list
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
	
	// Enter email in signup page
		@FindBy(name = "email")
		public WebElement emailsignup_UI;
	
   // Enter password in signup page
		@FindBy(name = "password")
		public WebElement passwordsignup_UI;
		
	// reenter password in signup page
		@FindBy(name = "password_confirm")
		public WebElement passwordconfirmsignup_UI;	
		
	// email id already exist
		@FindBy(css = ".notification.notification-error")
		public WebElement emailexist_UI;
		
	// email id already exist
		@FindBy(css = ".xeraMain.clearfix h1")
		public WebElement heading_UI;
		
		
	// Click when field 
		@FindBy(css = ".autocomplete.withFlag.withFlag")
		public List<WebElement> autocomplete_UI ;
			
	// Empty list mesage
		@FindBy(css = ".empty-list-message")
		public WebElement emptylist_UI;
		
	// tip message
		@FindBy(css = ".tip-message")
		public WebElement tipmessage_UI;
		
	// Logout page -paragraphs
		@FindBy(css = ".temp-nav a")
		public List<WebElement> navigation_UI;		
		
	// Logout page -paragraphs
		@FindBy(css = ".pull-left p")
		public List<WebElement> logoutparagraphs_UI;	
		 	
	// Set up alert in logout page
		@FindBy(css = ".splashFooter.clearfix a")
		public List<WebElement> setupalert_UI;	
				 	
	// important note in logout page
		@FindBy(css = ".splashFooter.clearfix p")
		public WebElement importantnote_UI;
		
	//Delete
		@FindBy(id = "deleteToggle")
		public WebElement delete_UI;  
		
	//Delete - before return to list
		@FindBy(id = "delete")
		public WebElement del_UI;	
		
	
    //Delete List
		@FindBy(css = ".alertList-deletes")
		public List<WebElement> alertlistdelete_UI;
		
	//Edit list
		@FindBy(css = ".nav-right a")
		public WebElement edit_UI;
		
	//Faq heading
		@FindBy(css = ".module-header h2")
		public WebElement faq_UI;
	
    // Faq paragraph
		@FindBy(css = ".module-header p")
		public WebElement faqparagraph_UI;
		
	//Faq List - question
		@FindBy(css = ".question")
		public List<WebElement> questionlist_UI;
		
	//Faq List - answer
		@FindBy(css = ".answer p")
		public List<WebElement> answerparagraph_UI;	
		
	//Faq List - answer
		@FindBy(css = ".answer")
		public List<WebElement> answer_UI;		
	
	//faq link - logout page
		@FindBy(css = ".supportNav a")
		public List<WebElement> supportnav_UI;	
		
		
		
		
		
		
		
		
		
		
		
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
		 
		 public void enterEmail(String email){
			emailsignup_UI.sendKeys(email);
		    }
		 
		 public void enterpassword(String password){
				passwordsignup_UI.sendKeys(password);
			    }
		 
		 public void enterpasswordconfirm(String passwordconfirm){
				passwordconfirmsignup_UI.sendKeys(passwordconfirm);
			    }

}
