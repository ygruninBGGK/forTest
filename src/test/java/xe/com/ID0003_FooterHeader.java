package xe.com;


    import java.net.MalformedURLException;
	import java.util.NoSuchElementException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;



	public class ID0003_FooterHeader{

		private String baseUrl;
		private FirefoxDriver driver;
	   	
		@Parameters({"BaseUrl","browser"})
	    @BeforeClass
	    public void BaseUrl(@Optional("http://mlo04.xe.com") String url, @Optional("firefox")String browser) throws MalformedURLException, InterruptedException {	
			driver = new FirefoxDriver();
			baseUrl = "http://mlo04.xe.com/";
		}
			
	  @Test
	  public void a_redirecttoXecom(){
	  // C5261	check and make sure headers and footer of Xe.com are changed from h2 to h3
		  driver.get(baseUrl);
		  
	
}
	  
	}
