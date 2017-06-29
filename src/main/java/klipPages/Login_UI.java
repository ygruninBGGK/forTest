package klipPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_UI {

		//username input
		@FindBy(id = "f-username")
		public WebElement usernameInput_UI;
    
    
    
		//pwd input
		@FindBy(id = "f-password")
		public WebElement pwdInput_UI;
		
		//pwd input
		@FindBy(id = "login")
		public WebElement loginBtn_UI;
		
		
		
		
		
		
//**************************ACTIONS******************************//
		
		
		public void Login(String user, String pwd){
			usernameInput_UI.sendKeys(user);
			pwdInput_UI.sendKeys(pwd);
			loginBtn_UI.click();
			
	    }
}
