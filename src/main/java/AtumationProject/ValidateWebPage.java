package AtumationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ValidateWebPage {

@Test	
public void test1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.puneripattern.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		driver.findElement(By.linkText("About Us")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("hello");
		
		if(title.equals("About Us | Puneri Pattern")) {
			System.out.println("success");
			
		}else {
			System.out.println("failed");
		}
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
