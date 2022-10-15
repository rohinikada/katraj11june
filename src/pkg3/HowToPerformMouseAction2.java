package pkg3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToPerformMouseAction2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#photo%20Manager");
		
		//switch to I-Frame    //drag n drop
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		
		WebElement imageElement = driver.findElement(By.xpath("//ul[@id='gallery']"));   //source
		
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='trash']"));   //Target
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(imageElement, targetElement).perform();

		act.moveToElement(imageElement).clickAndHold().moveToElement(targetElement).release().build().perform();
		
		
	}

}
