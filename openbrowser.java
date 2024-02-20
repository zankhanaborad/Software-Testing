package corejava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://demoqa.com/automation-practice-form");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		driver.findElement(By.id("firstName")).sendKeys("zankhana");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("borad");
		driver.findElement(By.id("userEmail")).sendKeys("zankhanaborad5195@gmail.com");

		
		List<WebElement> gender = driver.findElements(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label"));
		gender.get(1).click();
		driver.findElement(By.id("userNumber")).sendKeys("9904366888");
		driver.findElement(By.cssSelector("#subjectsContainer > div > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")).sendKeys("hello tops Technology");
		driver.findElement(By.id("currentAddress")).sendKeys("nikol,ahmedabad");
		driver.close();

	}

}
