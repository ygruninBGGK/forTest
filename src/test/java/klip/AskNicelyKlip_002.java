package klip;



import org.testng.annotations.Test;

import utils.ParentsTest;

public class AskNicelyKlip_002 extends ParentsTest{
	
	
	@Test
	  public void a_login() throws InterruptedException{
		
		String title = "AskNicely Net Promoter Score (Last } Days)";
		  
			// open the login page and login
			general.open(baseUrl);
			login.Login("ygrunin@gmail.com", "Klip789456"); // this is hardcoded for now. We can generate new users by adding them a timestamp, or to use and exsel as @DataProvider
			
			
			// add Weather Klip to a dashboard
			dash.AddKlip("AskNicely"); // adding the AskNicely to dashboard. The inside function can be improved and used for any Klip
	
			
			
			// Verify the Weather Klip is on dashboard.  Start from refresh the page
			dash.KlipOnDash(title);
			driver.navigate().refresh();
			dash.KlipOnDash(title);
			driver.get("https://app.klipfolio.com/users/logout");    // logout and login and verify the Klip is still there
			login.Login("ygrunin@gmail.com", "Klip789456"); 
			dash.KlipOnDash(title);
			
			//remove Klip
			dash.RemoveKlip();
	    
		 }
	  
	
}
