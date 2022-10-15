package pkg6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleIframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		
		driver.get("https://demoqa.com/alerts");
		
		
		
		
		
	}

}
