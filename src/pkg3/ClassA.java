package pkg3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		//Click method
		WebElement bmwRadioBtc = driver.findElement(By.xpath("//input[@id='bmwradio']"));
		bmwRadioBtc.click();
		
		//getText method
		WebElement text = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		System.out.println(text.getText());
	
		//send keys
		WebElement inputField = driver.findElement(By.xpath("(//input[@id='name']"));
		inputField.sendKeys("Velocity Class");
		
		//getAttribute method
		WebElement getAttribute = driver.findElement(By.xpath("//input[@id='bmwradio']"));
		System.out.println(getAttribute.getAttribute("type"));
		
		//isSelected method
		System.out.println(bmwRadioBtc.isSelected());
		WebElement benzRadioBtc = driver.findElement(By.xpath("//input[@id='benzcheck']"));
		System.out.println(benzRadioBtc.isSelected());
		
		//isEnabled method
		WebElement inputFieldForEnabled = driver.findElement(By.xpath("//input[@id='enabled-example-input']"));
		System.out.println("Input Field is :" + inputFieldForEnabled.isEnabled());
		
		
		
		
				
	}

}
