package DangalTVsTestCases;

import org.openqa.selenium.WebDriver;

import GoogleTVtestScrips.ReusableMethods;

public class DangalTV_WifiTest extends ReusableMethods {
	

	public DangalTV_WifiTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	public void wifitest() {
		String command = "adb shell dumpsys wifi | grep 'Wi-Fi is'";
		String wifiStatus = executeShellCommand(command);

		System.out.println("WiFi Status: " + wifiStatus);
		
		
		
	}

}
