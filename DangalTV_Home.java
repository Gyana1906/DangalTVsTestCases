package DangalTVsTestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DangalTV_Home extends BastTest{
	
	
	@Test (dataProvider = "datainput")
	public void MainUI(String hdmiString,int i,int j) throws InterruptedException {
		
		System.out.println("Android Home Screen");
		Thread.sleep(2500);
		
//		try {
//			driver.findElements(By.id("com.google.android.tvlauncher:id/item_container")).get(0).click();
//
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		
//			
//		try {
//			driver.findElements(By.id("com.google.android.tvlauncher:id/tutorial_negative_action")).get(1).click();
//
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//	WebElement homElement=	driver.findElement(By.xpath("//*[@text='Home']"));
//	WebElement appselement=	driver.findElement(By.xpath("//*[@text='Apps']"));
//	
//	Assert.assertTrue(homElement.isDisplayed(),"Home Tab not available");
//	Assert.assertTrue(appselement.isDisplayed(), "apps tab not availble");
	
	
	List<WebElement> inputElements=driver.findElements(By.id("com.google.android.tvlauncher:id/button_icon"));
	inputElements.get(0).click();
	
	
	
    List<WebElement> inputstatusElement=driver.findElements(By.id("com.android.tv:id/input_item_connect_state_msg"));
    if (inputstatusElement.get(j).getText().equalsIgnoreCase("Connected")) {
		System.out.println(hdmiString +" Status is connected");
	}
    else {
    	System.out.println(hdmiString +" Status is not connected");
	}
	
	

	
		driver.findElement(By.xpath("//*[@text= '"+hdmiString+"']")).click();
		
   
	String sourceuiString=driver.findElement(By.id("com.android.tv:id/input_label")).getText();
		if (sourceuiString.equalsIgnoreCase(hdmiString)) {
			System.out.println(hdmiString + " Is Matching Source");
		} else {
			System.out.println(hdmiString + " Is not Matching Source");
		}
		
	
  List< WebElement> uIeleString=	driver.findElements(By.className("android.widget.TextView"));
  List<String> stringList = new ArrayList<>();
  List<Integer> tringList = new ArrayList<>();


	for (WebElement webElement1 : uIeleString) {
		String elementText = webElement1.getText();
		
		int lengttxt=elementText.length();
		tringList.add(lengttxt);
		
		stringList.add(elementText);
	}

	Thread.sleep(1000);
	
	if (tringList.contains(0)) {
		System.out.println("UI appeared- "+hdmiString +" connected");
		
	}	else {
		
		System.out.println("UI not appeared- "+hdmiString +" Not connected");}

	
	}
	
	
	@DataProvider
	
	public Object[][] datainput()
	{
	Object datainputstream[][]= {{"HDMI1",1,0},{"HDMI2",2,1},{"HDMI3",3,2}};
		
		return datainputstream;
		
	}
	

}
