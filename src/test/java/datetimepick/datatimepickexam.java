package datetimepick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class datatimepickexam {
	
	@Test
    public void test1() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Select scM=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		scM.selectByVisibleText("September");
		Thread.sleep(2000);
		Select scY=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		scY.selectByVisibleText("1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'21')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("react-datepicker__month-read-view--selected-month")).click();
		
		
		driver.findElement(By.xpath("//li[contains(text(),'13:15')]")).click();
		Thread.sleep(2000);
		
		
	}

}
