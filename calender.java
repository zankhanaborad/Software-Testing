package corejava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement iFrame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(iFrame);
		System.out.println("switch into iframe");
		
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();
		String myDate = "15";
		String myMonth = "March";
		String myYear = "2022";

		WebElement currentYear = driver.findElement(By.className("ui-datepicker-year"));
		String cyear = currentYear.getText();
		System.out.println(cyear);
		int my = Integer.parseInt(myYear);
		System.out.println(my);
		int cy = Integer.parseInt(cyear);
		System.out.println(cy);
//		WebElement prev = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span"));
		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (my > cy) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if (my > cy) {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
			} else {
				driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		List<WebElement> dates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement d : dates) {
			if(myDate.equals(d.getText())) {
				d.click();
			}
		}
	}
}