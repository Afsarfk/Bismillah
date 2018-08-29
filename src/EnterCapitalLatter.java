import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterCapitalLatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\SeleniumSetup\\geckodriver.exe\\");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions a=new Actions (driver);
		
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").doubleClick().build().perform();
		
		a.moveToElement(move).contextClick().build().perform();

	}

}
