package corejava.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabledata {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement name = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]/span"));
		System.out.print(name.getText());
		
//	WebElement rows = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1/th[1]/span"));
//	System.out.println(rows.getText());
	}

}
