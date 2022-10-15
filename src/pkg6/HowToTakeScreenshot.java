package pkg6;

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

public class HowToTakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->Upcasting
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_CjwKCAjwyaWZBhBGEiwACslQo3-TBPrrA9qMwFeHlStyk0xxeKwBXARc7JxxaWGWuoVZ6GwC20EOEhoCcnwQAvD_BwE_k_&gclid=CjwKCAjwyaWZBhBGEiwACslQo3-TBPrrA9qMwFeHlStyk0xxeKwBXARc7JxxaWGWuoVZ6GwC20EOEhoCcnwQAvD_BwE");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//getScreenShotMethod(driver);
	
	WebElement enterEmail = driver.findElement(By.xpath("//span[@class='nav-action-inner'][2]"));
	enterEmail.sendKeys("harshaparshuramkar22@gmail.com");

	//WebElement enterPassword = driver.findElement(By.xpath("//input[@type='password']"));
    //  enterPassword.sendKeys("parth123");

	//WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	//loginButton.click();
	
	//WebElement closeIconButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	//closeIconButton.clear();
	
//	Thread.sleep(2000);
//
//	
//	getScreenShotMethod(driver);
//}
//
//public static void getScreenShotMethod(WebDriver driver) throws IOException {
//Date date = new Date();
//SimpleDateFormat fmt = new SimpleDateFormat("DDhhmmss");
//String currenttime = fmt.format(date);
//
//TakesScreenshot k = (TakesScreenshot)driver;
//	
//File source = k.getScreenshotAs(OutputType.FILE);	  //1st step
////File destination = new File("");
////FileHandler.copy(source, destination);
//
		
		
		
		
		
		
		
		
		
		
	}

}
