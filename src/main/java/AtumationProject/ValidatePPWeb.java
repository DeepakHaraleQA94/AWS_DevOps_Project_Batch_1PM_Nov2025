package AtumationProject;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ValidatePPWeb {

//	/Package- collection of classes\
//class - collection of data members and member function
	// data member - collection of variable
	// memebr function - collection of method
	int i =20;
	public void validateWeb() {
		
	}
	
	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.puneripattern.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		driver.findElement(By.linkText("About Us")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		if(title.equals("About Us | Puneri Pattern")) {
			System.out.println("success");
			
		}else {
			System.out.println("failed");
		}
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
