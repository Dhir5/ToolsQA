package Buttons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ButtonExample {
	@Test
	public void testButton() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;  
	    js.executeScript("scrollBy(100, 500)");
	    Thread.sleep(3000);
	  	driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		Actions ac=new Actions(driver);
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		ac.doubleClick(doubleClick).perform();
		
		
		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(rightClick).perform();
		
		
		
		WebElement dClick= driver.findElement(By.xpath("//button[@id='wYrWm']"));
		ac.click(dClick).perform();
		
		
		driver.close();
		
	}

}
