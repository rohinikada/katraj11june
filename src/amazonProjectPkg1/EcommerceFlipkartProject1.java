package amazonProjectPkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceFlipkartProject1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("harshaparshuramkar2@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("parth123");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();  //login
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone13");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='_3OO5Xc']"));
		//System.out.println(productList.size());
		for(int i=0;i<3;i++) {
			productList.get(i).click();
			String mainPageAddress = driver.getWindowHandle();
		//	System.out.println("Main Page Address :" + mainPageAddress);
			Set<String> allAddress = driver.getWindowHandles();
			List<String> allAddressList = new ArrayList<>(allAddress);
			System.out.println("All Page Address :" + allAddressList);
			for(int i1=0; i1<allAddressList.size(); i1++) {
			driver.switchTo().window(allAddressList.get(i1));
			System.out.println(driver.getTitle());
			System.out.println();
			}
			
				if(i==3) {
					driver.findElements(By.xpath("//button[@class='L0Z3Pu']"));
				}
			
			
		
	}
		
		
	}

}
