package ptc;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pc2 {

	
	@Test
	public void test1() throws InterruptedException
	{
		WebDriver d= new ChromeDriver();
		d.get("https://cqube.jharkhand.gov.in/#/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.findElement(By.xpath("(//input)[1]")).sendKeys("cqube_jh");
		
		d.findElement(By.xpath("(//input)[2]")).sendKeys("Cqube_jh@123");
	
		d.findElement(By.xpath("//button")).click();	
		d.findElement(By.xpath("(//div[@class='ng-star-inserted'])[1]")).click();
		d.findElement(By.xpath("//li")).click();
		d.findElement(By.xpath("(//button)[4]")).click();
		
		WebElement per_page = d.findElement(By.xpath("//div[@class='mat-form-field-wrapper ng-tns-c108-5']"));
	
		Actions a= new Actions(d);
		a.click(per_page).perform();
		a.sendKeys(Keys.HOME).perform();
		List<WebElement> per_page_options = d.findElements(By.xpath("//span[@class='mat-option-text']"));
		System.out.println(per_page_options.size());
	/*	per_page_options.get(0).click();
		List<WebElement> f_records = d.findElements(By.xpath("(//table[@class='mat-table cdk-table mat-sort'])[1]//tr[position()]/td[1]"));
		System.out.println(f_records.size());
		Assert.assertEquals(5, f_records.size());
		
		*/
		ArrayList per_page_options_values= new ArrayList();
		ArrayList numberOfRecordsPresent=new ArrayList();
		/*for(WebElement op: per_page_options)
		{
			String txt = op.getText();
			per_page_options_values.add(txt);
			op.click();
			 List<WebElement> records = d.findElements(By.xpath("(//table[@class='mat-table cdk-table mat-sort'])[1]//tr[position()]/td[1]"));
			numberOfRecordsPresent.add(records);
			
		}*/

		for(int i=0;i<=per_page_options.size();i++)
		{
			per_page_options.get(i).click();
			
			
		}
		
		
		
		
		
		
	}
	
	@DataProvider(name="test1")
	public Object[] testData()
	{
		Object [] o= {5,10,20,30};
		return o;
	}
	
}
