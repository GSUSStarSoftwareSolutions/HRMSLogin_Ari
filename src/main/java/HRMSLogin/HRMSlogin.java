package HRMSLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMSlogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.pockethrms.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section[1]/div/div[2]/div/div[3]/div/div/a/span/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/div/section/div/div/div/div[2]/div/h1/a")).click();
		
		driver.findElement(By.name("CompanyCode")).sendKeys("12345678");
		
		driver.findElement(By.id("EmployeeCode")).sendKeys("xyz");
		
		driver.findElement(By.id("Password")).sendKeys("1234");
		
		driver.findElement(By.xpath("//*[@id=\"authenticate\"]/div/div[1]/div[2]/div/div/div[2]/div/form/input[3]")).click();
	}

}
