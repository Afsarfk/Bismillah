import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\SeleniumSetup\\geckodriver.exe\\");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		
		Actions a =new Actions(driver);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();                                                                                                                                                                              
		
		

	}

}
