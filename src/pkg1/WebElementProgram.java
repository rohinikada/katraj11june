package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->Upcasting
		driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement enterEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	enterEmail.sendKeys("harshaparshuramkar22@gmail.com");
	WebElement enterPassword = driver.findElement(By.xpath("//input[@type='password']"));
	enterPassword.sendKeys("parth123");
	WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	loginButton.click();

	}

}
