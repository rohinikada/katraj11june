package openChromeBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    
	    Point p = new Point(500,300);
	    driver.manage().window().setPosition(p);
	    System.out.println(driver.manage().window().getPosition().getX());
	    System.out.println(driver.manage().window().getPosition().getY());
	}

}
