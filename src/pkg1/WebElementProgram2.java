package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementProgram2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://courses.letskodeit.com/practice");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//getAttribute method
		WebElement getAttribute = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
		System.out.println(getAttribute.getAttribute("type"));
		
		//multipleText method
		WebElement multipleText = driver.findElement(By.xpath("(//fieldset)[1]"));
		System.out.println(multipleText.getText());
		
		//isSelected
		WebElement benzRadioBtn = driver.findElement(By.xpath("//input[@id='benzradio']")) ;
		System.out.println(benzRadioBtn.isSelected());
		
		//isEnabled
		WebElement inputFieldForEnabled = driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
		System.out.println("Input Field is :" + inputFieldForEnabled.isEnabled());
		
		//isDisabled
		WebElement dBtn = driver.findElement(By.xpath("//input[@id='disabled-button']"));
		dBtn.click();
		System.out.println("Input field is :" + inputFieldForEnabled.isEnabled());
		
		}
	}
