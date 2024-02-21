package DangalTVsTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DangalTV_WifitoggleswitchTest extends BastTest{
	
	
	@Test
	public void wifitesttoggle() throws InterruptedException {
		System.out.println("Android UI");
		driver.findElements(By.id("com.google.android.tvlauncher:id/button_icon")).get(1).click();
		
		driver.findElement(By.xpath("//*[contains(@text,'Network ')]")).click();
		
		
	String tagString=	driver.findElement(By.id("android:id/switch_widget")).getAttribute("checked");
	Assert.assertTrue(tagString.equalsIgnoreCase("true"), "Expected true");

     WebElement wifitogElement=	driver.findElements(By.id("android:id/switch_widget")).get(0);
     for(int i=0; i<=9;i++)
     {
    	 wifitogElement.click();
     }
     
	 Thread.sleep(5000);

      String wificonnectstatuString=  driver.findElements(By.id("android:id/summary")).get(0).getText();
      System.out.println( "Wifi reconnecting status shows: "+ wificonnectstatuString);
     
      Assert.assertTrue(wificonnectstatuString.trim().equalsIgnoreCase("Connected"), "Status Connecetd");
		
	
      DangalTV_WifiTest wifieTest=new DangalTV_WifiTest(driver);
      wifieTest.wifitest();
      
      
      
	}

}
