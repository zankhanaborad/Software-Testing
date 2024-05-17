package corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseevent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement img1=driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions action =new Actions(driver);
		action.clickAndHold(img1).moveToElement(trash).release().build().perform();
	}

}
