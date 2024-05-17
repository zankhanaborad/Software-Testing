package corejava.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STAR\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://cosmocode.io/automation-practice-webtable/");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> table_d = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		
		for(int i=2;i<=table_d.size();i++) {
			
			WebElement data = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[1]/td["+i+"]/h3/strong"));
			System.out.println(data.getText()+"   ");
			
		
		
		}
		
		System.out.println();
		
		
for(int i=2;i<=rows.size();i++) {
			
			List<WebElement> td = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
			
			for(int j=2;j<=td.size();j++) {		
//				
//			WebElement data =  driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]/h3/strong"));
//				System.out.println(data.getText()+"   ");

			
			WebElement data = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+j+"]/td/strong"));	
			System.out.println(data.getText() +"    ");
			}
			
			for(int k=3;k<=td.size();k++) {		
			
			WebElement data1 = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+k+"]/td"));	
			System.out.println(data1.getText() +"    ");
	
			}
			System.out.println();
			
			}
		
	}

}
