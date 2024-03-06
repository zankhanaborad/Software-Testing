package corejava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

		
	driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[2]")).click();	
		driver.findElement(By.id("userNumber")).sendKeys("9904366888");
//
//		WebElement e= driver.findElement(By.id("subjectsContainer]"));
//		e.sendKeys("hello");
		//driver.findElement(By.id("subjectsInput")).click();
		
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		  WebElement uploadpic = driver.findElement(By.id("uploadPicture"));
	
		   uploadpic.sendKeys("C:/Users/STAR/Pictures/pic gps.png"); 
		   System.out.println("File is Uploaded Successfully");
		   
			driver.findElement(By.id("currentAddress")).sendKeys("nikol,ahmedabad");
			
		   WebElement state = driver.findElement(By.className("css-1uccc91-singleValue"));
			Select states = new Select(state);
			states.selectByIndex(1);
		
			
			  WebElement city = driver.findElement(By.className("css-1uccc91-singleValue"));
				Select citys = new Select(city);
				citys.selectByIndex(2);

			
		driver.findElement(By.id("submit")).click();
		
		driver.close();

	}
	
	


}
