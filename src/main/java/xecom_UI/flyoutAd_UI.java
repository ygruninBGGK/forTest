package xecom_UI;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flyoutAd_UI {
	
	//click on any rates
		@FindBy(css = ".liveRatesRw a")
		public List<WebElement> rate_UI;
	
	//XEMT link on flyout ad
		@FindBy(css = ".bottomad")
		public WebElement moneytransferad_UI;
		
	// Inverse button on flyout ad 
		@FindBy(css = ".chart_sprite.invbutton")
		public WebElement inverse_UI;
	
	// Chart data before inverse 
		@FindBy(css = ".row2column2")
		public WebElement chartdata_UI;
		
	// information button 
		@FindBy(css = ".chart_sprite.infobutton")
		public WebElement information_UI;	
	
	// information button  - content 
		@FindBy(id = "infotext")
		public WebElement popuptitle_UI;	
		
	// Chart button 
		@FindBy(css = ".chart_sprite.chartbutton")
		public WebElement chartbutton_UI;
		
	//Chart information - heading (after navigation)
		@FindBy(css = ".module.clearfix h1")
		public WebElement chartheading_UI;
		
	//Chart information heading - sub heading 
		@FindBy(css = ".module.clearfix h2")
		public List<WebElement> subheading_UI;
		
	//Chart information - paragraph 
		@FindBy(css = ".chartDescription p")
		public WebElement description_UI;
}
