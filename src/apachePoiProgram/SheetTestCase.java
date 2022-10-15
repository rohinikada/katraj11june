package apachePoiProgram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SheetTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\software and driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //object-->upcasting
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String actualTitle =driver.getTitle();
		
		
		FileInputStream file = new FileInputStream("C:\\HP\\data1.xlsx");
		
		Workbook work = WorkbookFactory.create(file);
		
		Sheet sheet = work.getSheet("Sheet1");
	  
		Row row = sheet.getRow(0);
	
		Cell cell = row.getCell(0);
		String expectedTitle = cell.getStringCellValue();  
		
		if(actualTitle.equals(expectedTitle))
		{
		System.out.println("Test case is passed");	
		}else
			
		{
		 System.out.println("Test case is Failed");	
		}
	}


	}

