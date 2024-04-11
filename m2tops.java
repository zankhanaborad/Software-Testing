package corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class m2tops {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.tops-int.com/contact-us/");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		driver.findElement(By.id("inq_name")).sendKeys("zankhana");
		
		driver.findElement(By.id("inq_email")).sendKeys("zankhanaborad5195@gmail.com");
		driver.findElement(By.id("inq_contact")).sendKeys("9904366888");
		driver.findElement(By.linkText("inq_contact")).click();
		driver.close();
	}

}
