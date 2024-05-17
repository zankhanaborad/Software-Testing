package corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_calender {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.className("resp-tab-item resp-tab-active")).click();
		
		Thread.sleep(2000);	
		
		
		driver.findElement(By.id("datepicker")).click();
		
	

//		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
//			WebElement year = driver.findElement(By.className("ui-datepicker-year"));
//		Select years = new Select(year);
//		years.selectByVisibleText("2020");
//		
//		
//		WebElement date =  driver.findElement(By.linkText("15"));
//		date.click();Select monhts = new Select(month);
//		monhts.selectByValue("3");

	

		
	}

}
