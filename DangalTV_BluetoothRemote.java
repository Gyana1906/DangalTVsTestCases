package DangalTVsTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GoogleTVtestScrips.GenericMethod;

public class DangalTV_BluetoothRemote  extends BastTest{
	


	@Test
	public void bleremoteTest() throws InterruptedException {
		System.out.println("Android UI");

		

		List<WebElement> inputElements=driver.findElements(By.id("com.google.android.tvlauncher:id/button_icon"));
		inputElements.get(1).click();
		
//	     String Remoteassessories=driver.findElement(By.xpath("//*[contains(@text,'Remotes')]")).getText();
		
		String Remoteassessories="Remotes";
		
		GenericMethod.scrollUI(driver, Remoteassessories).click();
		Thread.sleep(2000);
		
		
		
	String blestringString=	driver.findElements(By.id("android:id/title")).get(1).getText();
	
	WebElement bleconnectionstatuString=driver.findElement(By.id("android:id/summary"));
	if (bleconnectionstatuString.getText().equalsIgnoreCase("Connected")) {
		System.out.println(blestringString+" Connected");
	}
	
	
	    bleconnectionstatuString.click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@text='Unpair']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@text='OK']")).click();
	    
	    Thread.sleep(4000);
	    
	    if (driver.findElement(By.xpath("//*[@text='Connected']")).getText().equalsIgnoreCase("Connected")) {
			System.out.println("RC re-Connected");
		}

		
	    
	    DangalTV_BluetoothTest ble=new DangalTV_BluetoothTest(driver);
	    ble.bttest();
		
	}
	
	

}
