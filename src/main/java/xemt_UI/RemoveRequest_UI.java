package xemt_UI;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveRequest_UI {

  // Region switch ca
	@FindBy(css = ".regionSwitch a")
	public List<WebElement> regionswitch_UI;
	
 // important information page
	@FindBy(id = "footerContent a")
	public List<WebElement> footerContent_UI;
	
//important information page heading
	@FindBy(css = ".sectionTitle")
	 public WebElement sectionTitle_UI;
}
