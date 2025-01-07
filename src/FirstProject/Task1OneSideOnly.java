package FirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1OneSideOnly {

	WebDriver driver = new ChromeDriver();
	String myWebsite = "https://www.saucedemo.com";
	String user_name = "standard_user";
	String passwordInput = "secret_sauce";

	@BeforeTest
	public void MySetup() {
		driver.get(myWebsite);
		driver.manage().window().maximize();
		// driver.manage().window().minimize();
		// driver.manage().window().fullscreen();

	}

	@Test(priority = 1)
	public void Login() {

	
		WebElement UserNameInputField = driver.findElement(By.id("user-name"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserNameInputField.sendKeys(user_name);
		PasswordInputField.sendKeys(passwordInput);
		LoginButton.click();

	}

	@Test(priority = 2, enabled = false)
	public void AddOnlyLeftSideProducts() throws InterruptedException {
		Thread.sleep(2000);
		
		List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));
		for (int i =0; i < AddToCartButtons.size();i+=2) {
			AddToCartButtons.get(i).click();
		}
	}
     
	@Test (priority=3)
	public void AddOnlyRightSideProducts() throws InterruptedException {
		Thread.sleep(2000);
		
		List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));
		for (int i =1; i < AddToCartButtons.size();i+=2) {
			AddToCartButtons.get(i).click();
		}
	}
	
	
}
