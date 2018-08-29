import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumSetup\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		

	}

}
