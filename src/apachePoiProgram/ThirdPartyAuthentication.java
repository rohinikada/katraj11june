package apachePoiProgram;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdPartyAuthentication {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();

	driver.findElement(By.xpath("//li[@id='signInLink']")).click();
	Thread.sleep(2000);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']")));
	
	driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
	Thread.sleep(2000);

	
	Set<String> windowSet = driver.getWindowHandles();
	for(String k: windowSet ){
	  driver.switchTo().window(k);	
		
	  if(driver.getTitle().equals("Sign in - Google Accounts")) 
	  {
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("harshaparshuramkar2@gmail.com");
	  }
	}
	
	
	

	}
	}
