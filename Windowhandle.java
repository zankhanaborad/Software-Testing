package corejava.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://demo.guru99.com/popup.php");
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		String mainwin = driver.getWindowHandle();
		System.out.println(mainwin);
		
		
	Set<String> allwin = driver.getWindowHandles();
	for(String win : allwin) {
		System.out.println(win);
		if(!win.equals(mainwin)) {
			driver.switchTo().window(win);
			System.out.println("switch to new windows");
			driver.findElement(By.name("emailid")).sendKeys("zankhana@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
		}
		
	}
		driver.quit();
	}

}
