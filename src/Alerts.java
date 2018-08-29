import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\SeleniumSetup\\geckodriver.exe\\");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".display > form:nth-child(1) > input:nth-child(1)")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();                                                            
		
		
		
		 

	}

}
