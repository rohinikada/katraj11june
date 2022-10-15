package apachePoiProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	 driver.findElement(By.xpath("(//button[@id='promtButton']")).click();
     Alert alert = driver.switchTo().alert();
     Thread.sleep(2000);
     
     System.out.println(alert.getText());
     Thread.sleep(2000);
     alert.sendKeys("Hrasha");
     Thread.sleep(2000);
     alert.accept();
     
     
	
	}



}
