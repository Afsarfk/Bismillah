import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\SeleniumSetup\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.salesforce.com");
		//driver.findElement(By.cssSelector("a[class*='dropdown']")).click();
		driver.findElement(By.xpath("/html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a")).click();
		driver.findElement(By.id("username")).sendKeys("sumon");
		driver.findElement(By.id("password")).sendKeys("12345");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("https://yahoo.com");
		//driver.navigate().back();
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
		
		
		
		
		
		
	}

}
