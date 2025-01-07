package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

	WebDriver driver = new ChromeDriver();
	
	

	
	@BeforeTest
	public void BeforeSecondTestStarts () {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void MySecondTest() {
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("youtube"+Keys.ENTER);
		
	driver.findElement(By.xpath("//*[@id=\"ixcYae\"]/div/div/div/div/div/div/div[1]/div/span/a/h3/span")).click();
	
	driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input")).sendKeys("arthur james"+Keys.ENTER);
		
	
	}
	
	
	@AfterTest
	public void MyTestIsDone() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}
