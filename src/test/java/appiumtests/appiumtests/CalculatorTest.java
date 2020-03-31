package appiumtests.appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
	
		 try{
			 openCalculator();
		 }catch (Exception exp) {
			 System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
    
	}
	
	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1812");
		cap.setCapability("udid", "YPWOY9Q4EM9HEEBQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started");
		
		MobileElement two = driver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
		MobileElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
		MobileElement three = driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
		MobileElement equals = driver.findElement(By.id("com.android.bbkcalculator:id/equal"));
		MobileElement result = driver.findElement(By.id("com.android.bbkcalculator:id/input_edit"));
		two.click();
		plus.click();
		three.click();
		equals.click();
		String res = result.getText();
		System.out.println("Result is :" +res);
		System.out.println("Calculation completed");
			
	}

	
}
