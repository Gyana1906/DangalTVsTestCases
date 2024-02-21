package DangalTVsTestCases;

import org.openqa.selenium.WebDriver;

import GoogleTVtestScrips.ReusableMethods;

public class DangalTV_BluetoothTest extends ReusableMethods{
	
	public DangalTV_BluetoothTest(WebDriver driver) {
		super(driver);
		
		
		// TODO Auto-generated constructor stub
	}

	public void bttest() {
		String command = "adb shell settings get global bluetooth_on";
		String bluetoothStatus = executeShellCommand1(command);

		// Parse the Bluetooth status from the shell command output
		int bluetoothState = -1; // Default state for error handling

		try {
			bluetoothState = Integer.parseInt(bluetoothStatus.trim());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		// Determine the Bluetooth status based on the state
		String bluetoothStatusText;
		if (bluetoothState == 0) {
			bluetoothStatusText = "Bluetooth is disabled";
		} else if (bluetoothState == 1) {
			bluetoothStatusText = "Bluetooth is enabled";
		} else {
			bluetoothStatusText = "Unknown Bluetooth status";
		}

		// Print the Bluetooth status
		System.out.println("Bluetooth Status: " + bluetoothStatusText);

	}

		
		
	}
	
	
	
	
	


