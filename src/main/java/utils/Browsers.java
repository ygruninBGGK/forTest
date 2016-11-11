package utils;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Browsers {


		
		public static RemoteWebDriver getDriver(String browser) throws MalformedURLException {
			if (browser.equals("firefoxLocal")){
				return new FirefoxDriver();
			}
			return new RemoteWebDriver(new URL("http://172.16.21.110:4444/wd/hub"), getBrowserCapabilities(browser));
			
		}
		

		private static DesiredCapabilities getBrowserCapabilities(String browserType) {
			switch (browserType) {
			case "firefox":
				System.out.println("Opening firefox driver");
				DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
				capabilities.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY,true);
				return capabilities;
			case "firefoxWin":
				System.out.println("Opening firefox driver win");
				DesiredCapabilities capabilities1 =  DesiredCapabilities.firefox();
				capabilities1.setCapability(CapabilityType.PLATFORM,Platform.WINDOWS);
				capabilities1.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
				capabilities1.setCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY,true);
				return capabilities1;
			case "chrome":
				System.out.println("Opening chrome driver");
				return DesiredCapabilities.chrome();
			case "IE":
				System.out.println("Opening IE driver");
				DesiredCapabilities capabilities2 = DesiredCapabilities.internetExplorer(); 
				DesiredCapabilities.internetExplorer();
				capabilities2.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
				return capabilities2;
				
				//return DesiredCapabilities.internetExplorer();
			default:
				System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
				return DesiredCapabilities.firefox();
			}
		}
	}
	
	

