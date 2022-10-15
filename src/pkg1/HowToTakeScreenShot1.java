package pkg1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HowToTakeScreenShot1 {

	


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->Upcasting
		driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	getScreenShotMethod(driver);
	
	WebElement enterEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	enterEmail.sendKeys("harshaparshuramkar22@gmail.com");
	WebElement enterPassword = driver.findElement(By.xpath("//input[@type='password']"));
	enterPassword.sendKeys("parth123");
	WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	loginButton.click();
	
	Thread.sleep(2000);
	
	//WebElement enterno = driver.findElement(By.xpath("//input[@maxlength='10']"));
		//	enterno.sendKeys("9168278611");
			
  // WebElement enterPw= driver.findElement(By.xpath("//input[@type='password']"));
		//enterPw.sendKeys("parth123");
			
	//WebElement continueButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		//continueButton.click(); 
		
   // WebElement enterPw1= driver.findElement(By.xpath("//input[@type='password']"));
	//	enterPw1.sendKeys("parth123");

		
			Thread.sleep(2000);
			getScreenShotMethod(driver);
	}

public static void getScreenShotMethod(WebDriver driver) throws IOException {
	Date date = new Date();
	SimpleDateFormat fmt = new SimpleDateFormat("DDhhmmss");
	String currenttime = fmt.format(date);
	
	TakesScreenshot k = (TakesScreenshot)driver;
			
	File source = k.getScreenshotAs(OutputType.FILE);	  //1st step
	//File destination = new File("");
	//FileHandler.copy(source, destination);
	
	
	
	
	
	
	}

		
	}

