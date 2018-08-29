import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\SeleniumSetup\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector(".create-new-account > a:nth-child(2)")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sumonfk");
		driver.findElement(By.cssSelector("#tblcrtac > tbody:nth-child(1) > tr:nth-child(7) > td:nth-child(3) > input:nth-child(1)")).sendKeys("Sumonfk");
		driver.findElement(By.cssSelector("#tblcrtac > tbody:nth-child(1) > tr:nth-child(10) > td:nth-child(3) > input:nth-child(1)")).sendKeys("12345678");
		driver.findElement(By.cssSelector("#tblcrtac > tbody:nth-child(1) > tr:nth-child(12) > td:nth-child(3) > input:nth-child(1)")).sendKeys("12345678");
		driver.findElement(By.cssSelector("#div_altemail > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > input:nth-child(1)")).sendKeys("afsar_jo@yahoo.com");
		driver.findElement(By.className("nomargin")).click();
		
		Select s=new Select
		(driver.findElement(By.cssSelector("#div_hintQS > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(3) > select:nth-child(1)")));
		s.selectByValue("What is your favourite food?");
		
		driver.findElement(By.cssSelector("#div_hintQS > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(3) > input:nth-child(1)")).sendKeys("Birani");
		driver.findElement(By.cssSelector("#div_hintQS > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(3) > input:nth-child(1)")).sendKeys("Hosneara");
		driver.findElement(By.id("mobno")).sendKeys("6786461235");
		
		//Select s=new Select
		//driver.findElement(By.cssSelector("#tblcrtac > tbody:nth-child(1) > tr:nth-child(23) > td:nth-child(3) > select:nth-child(1)"));
		//s.selectByValue("03");
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		driver.findElement(By.id("country")).click();
		s.selectByVisibleText("Bangladesh");////////////////////
		
		driver.findElement(By.xpath("//input[@Value='captcha']")).sendKeys("HMPK");
		
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Sumon");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		//driver.findElement(By.xpath("//input[@name='proceed']")).click();

	}

}
