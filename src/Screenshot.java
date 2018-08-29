import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumSetup\\chromedriver.exe\\");
	
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WindowsUtils.killByName("excel.exe");  //Close excel sheet 
		
		driver.get("https://www.google.com");
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // ScrenShot 

		FileUtils.copyFile(src,new File("C:\\Users\\Owner\\screenshot.png"));
		
		
		

	}

}
