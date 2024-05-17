package corejava.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class warning {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://demoqa.com/alerts");
		driver.get(url);
		driver.manage().window().maximize();
		                   
		
	// alert 1	
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert =  driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
		
		
		//alert 2
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		driver.findElement(By.id("timerAlertButton")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert =  driver.switchTo().alert();
//		alert.accept();
		
		// alert3
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alert =  driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.dismiss();
//		
		//alert 4
		driver.findElement(By.id("promtButton")).click();     
		Alert alert =  driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("zankhana borad");
		alert.accept();
		
		
		
		
		
		
	}
	
	

}
