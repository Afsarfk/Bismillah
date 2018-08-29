import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\SeleniumSetup\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Afsar_jo@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("S336526F");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		//Select s=new Select
		
		//driver.findElement(By.id("userNavigationLabel")).click();
				
		

	}

}
