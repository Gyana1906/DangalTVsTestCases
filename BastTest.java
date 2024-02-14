package DangalTVsTestCases;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GTVTestCases.GenericMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BastTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void DangalBaseTest() throws IOException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
    	//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.APPIUM);
        cap.setCapability(MobileCapabilityType.UDID,GenericMethod.getvalue("DangalTVUdid"));
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,GenericMethod.getvalue("DangalTVPlatfomName"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, GenericMethod.getvalue("DangalTVPlatformVersion"));
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, GenericMethod.getvalue("DangalTVActivity"));
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,GenericMethod.getvalue("DangalTVPackage"));
        


        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        
       

     
    }

	
	@AfterClass
	public void testcomplete()
	{
		driver.quit();
	}
	
	
		
	}
	
	
	


