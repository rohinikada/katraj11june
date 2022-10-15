package pkg6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll by pixel
		js.executeScript("window.scrollBy(50,1200)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)");
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		try {
			aboutUs.click();}
		catch(Exception e)
		{//scroll by web element
		js.executeScript("arguments[0].scrollIntoView(true);",aboutUs);
			Thread.sleep(2000);
			aboutUs.click();
			}
		}

}
