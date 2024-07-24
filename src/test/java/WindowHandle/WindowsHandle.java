package WindowHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.InvokeDriver;

public class WindowsHandle extends InvokeDriver{
	@Test
	public void TestWindowHandles() {
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("item-5"))));
		
		driver.findElement(By.id("item-5")).click();
		
	}
}
