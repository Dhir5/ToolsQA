package AutoCompleteExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoCompleteExample {
	
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/auto-complete");
		driver.findElement(By.id("autoCompleteMultipleInput")).sendKeys("red");
		
		
	}

}
