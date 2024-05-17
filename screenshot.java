package corejava.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot

{
	public static void  getScreenShot(WebDriver driver,String path) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		try {
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyfile(source,dest);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://demoqa.com/automation-practice-form");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);	

	getScreenShot(driver,"D:/ss.png");
	driver.findElement(By.name("login")).click();

	getScreenShot(driver, "D:/aa.png");
	}

}
