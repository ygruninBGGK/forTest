package klipPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.RemoveAllSelections;

import jxl.common.BaseUnit;
import utils.General;

public class Dashboard_UI {
	
	// WebDriver initiating
    public WebDriver driver;
    private General general;
    
    public Dashboard_UI(WebDriver driver) {
        this.driver = driver;
        general = PageFactory.initElements(driver, General.class); 
    }
	
	
			//Add a Klip Btn
			@FindBy(id = "tb-tab-add_klip")
			public WebElement addKlipBtn_UI;
	    
	    
	    
			//Find a service input
			@FindBy(css = ".auto-addklip-find")
			public WebElement findServiceInput_UI;
			
		
			
			//Find a service input
			@FindBy(css = ".auto-service-key-weather")
			public WebElement weatherService_UI;
			
			
			//Find a service input
			@FindBy(css = ".gallery-item")
			public WebElement foundKlip_UI;
			
			
			
			
			//List of weather Klips
			@FindBy(css = ".item-title.link")
			public List<WebElement> chosenKlips_UI;
			
			
			
			//Add Klip from inside the Klip Explanation
			@FindBy(css = ".use-template-button.float")
			public WebElement addKlip_UI;
			
			
			//Klip Title
			@FindBy(css = ".klip-toolbar-title")
			public WebElement klipTtile_UI;
			
			
			
			
			// close the Add Klip popup Btn
			@FindBy(css = ".add_klip_overlay .right .rounded-button")
			public WebElement closeKlipSelectionBtn_UI;
			
			
			// close the Add Klip popup Btn
			@FindBy(css = ".add_klip_overlay .right .rounded-button")
			public List<WebElement> listCloseKlipSelectionBtn_UI;
			
			
			
			//Specific Klip menu
			@FindBy(css = ".klip-button-config")
			public WebElement klipMenu_UI;
			
			
			//Remove from Dashboard
			@FindBy(id = "menuitem-remove_klip")
			public WebElement removeKlip_UI;
			
			
			
			
			
			
			
			
	//**************************ACTIONS******************************//
			
			/// adding new Klip to dashboard
			public void AddKlip(String serviceName) throws InterruptedException{
				addKlipBtn_UI.click();
				Thread.sleep(2000);   // wee need it here     /// i would use the verifying that ajax loader disappeared 
				findServiceInput_UI.sendKeys(serviceName);
				findServiceInput_UI.sendKeys(Keys.RETURN);
				Thread.sleep(2000); // must be here to let search finish
				// instead of waiting i would add wait for ajax loader disappeared. Need developers help to get the Ajax Loader icon locator
//				WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);  
//				wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
				
				foundKlip_UI.click();
				chosenKlips_UI.get(0).click();
				addKlip_UI.click();
				Assert.assertEquals(addKlip_UI.getText(), "Adding...");
				Thread.sleep(2000); // will be used here the verify the adding process is not taking tisme
				Assert.assertEquals(addKlip_UI.getText(), "Added!");
				closeKlipSelectionBtn_UI.click();
				Assert.assertEquals(listCloseKlipSelectionBtn_UI.size(), 0);
		    }
			
			
			
			
			
			
			
			/// verify the Klip is on the dashboard
			public void KlipOnDash(String title){
				Assert.assertEquals(klipTtile_UI.getText(), title);
				// we can add more tests here for different elements on this Klip
			}
			
			
			
			// remove the Klip from Dashboard
			public void RemoveKlip(){
				klipMenu_UI.click();
				removeKlip_UI.click();
			}
	
}
