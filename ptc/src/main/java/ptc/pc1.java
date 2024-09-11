package ptc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pc1 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboard-ms.vercel.app/#/home");
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("tibil");
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("tibil@123");
	
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])[1]")).click();
	
		driver.findElement(By.xpath("//li")).click();
		driver.findElement(By.xpath("(//button)[4]")).click();
		driver.findElement(By.xpath("(//input)[5]")).clear();
	
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("000");
	
	
		driver.findElement(By.xpath("(//button)[10]")).click();
		
		driver.findElement(By.xpath("//li")).click();
		driver.findElement(By.xpath("(//button)[4]")).click();
		driver.findElement(By.xpath("(//input)[5]")).clear();
	
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("000");
	
	
		driver.findElement(By.xpath("(//button)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='noData ng-star-inserted'])[1]")).getText();
		driver.findElement(By.xpath("(//div[@class='noData ng-star-inserted'])[2]")).getText();
		driver.findElement(By.xpath("(//div[@class='noData ng-star-inserted'])[3]")).getText();
	}
		
		
	
}
