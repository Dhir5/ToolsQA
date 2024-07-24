package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeDriver  {
	
	protected static WebDriver driver;
	public void invoke() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	public void scrollPage() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(100, 500)");
	}
	public void quitAll() {
		driver.quit();	
	}

	public void close() {
		driver.close();
	}
}
