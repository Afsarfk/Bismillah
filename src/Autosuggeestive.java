import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggeestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumSetup\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		//Javascript DOM can extract hidden elements
		//We are using Javascript becouse selenium cannot identify hidden elements - Ajax implenemtation
		//Investigate the properties of object if it have any hidden text
		//javascriptExecutor 
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		String script ="return document.getElementByid(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		

	}

}
