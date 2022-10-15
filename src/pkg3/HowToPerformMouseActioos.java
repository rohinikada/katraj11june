package pkg3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToPerformMouseActioos {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//object of Actions class
		Actions act = new Actions(driver);
		act.contextClick(rightClickElement).perform();
		//act.moveToElement(rightClickElement).contextClick().build().perform();
		
		act.doubleClick(doubleClick).perform();
		//act.moveToElement(doubleClick).doubleClick().build().perform();
		
		
	}

}
