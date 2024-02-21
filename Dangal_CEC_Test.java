package DangalTVsTestCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GTVTestCases.GenericMethod;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Dangal_CEC_Test extends BastTest {

	@Test
	public void eceTest() throws InterruptedException {
		System.out.println("Android UI");
		Thread.sleep(2000);

		driver.findElements(By.id("com.google.android.tvlauncher:id/button_icon")).get(1).click();

		Thread.sleep(2000);

		driver.findElements(By.id("com.android.tv.settings:id/icon_frame")).get(2).click();

		for (int i = 0; i < 4; i++) {
			((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		}

//        buurns
		List<WebElement> buttonsetElements = driver.findElements(By.id("android:id/switch_widget"));

//		options

		String hdmicontrolString = driver.findElement(By.xpath("//*[contains(@text,'HDMI control')]")).getText();
		String autopoweroffString = driver.findElement(By.xpath("//*[contains(@text,'auto power off')]")).getText();
		String autopoweronString = driver.findElement(By.xpath("//*[contains(@text,'auto power on')]")).getText();
		String stayonpreviouString = driver.findElement(By.xpath("//*[contains(@text,'previous source')]")).getText();

		List<String> functionList = new ArrayList<>();
		functionList.add(hdmicontrolString);
		functionList.add(autopoweroffString);
		functionList.add(autopoweronString);
		functionList.add(stayonpreviouString);

		for (int j = 0; j < 4; j++) {
			String eletextString = buttonsetElements.get(j).getAttribute("checked");
			if (eletextString.equalsIgnoreCase("true")) {
				System.out.println(functionList.get(j) + " status enabled as default setting");
			} else {
				System.out.println(functionList.get(j) + " status is dissabled as default setting");
			}
		}
	}

}
